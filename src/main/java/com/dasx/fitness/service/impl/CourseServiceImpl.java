package com.dasx.fitness.service.impl;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.dasx.fitness.common.util.DateUtil;
import com.dasx.fitness.common.util.DateUtil.DateInfo;
import com.dasx.fitness.dto.comment.CourseComment;
import com.dasx.fitness.dto.course.Course;
import com.dasx.fitness.entity.CoursePlan;
import com.dasx.fitness.entity.Store;
import com.dasx.fitness.entity.UserCoursePlan;
import com.dasx.fitness.mapper.CourseCommentMapperExt;
import com.dasx.fitness.mapper.CourseMapperExt;
import com.dasx.fitness.mapper.CoursePlanMapperExt;
import com.dasx.fitness.mapper.StoreMapperExt;
import com.dasx.fitness.service.CourseService;
@Service
public class CourseServiceImpl implements  CourseService {

	private Logger log=LoggerFactory.getLogger(CourseServiceImpl.class);
	
	@Autowired
	private CourseMapperExt courseMapperExt;
	@Autowired
	private StoreMapperExt storeMapperExt;
	@Autowired
	private CoursePlanMapperExt coursePlanMapperExt;
	@Autowired
	private CourseCommentMapperExt	courseCommentMapperExt;
	
	@Override
	public List<Course> queryCourse(Integer storeId, String coursrTime) {
		try {
			Date startTime=DateUtil.parseDate(coursrTime);
			if(coursrTime.equals(DateUtil.getCurrentDateStr())){
				 startTime=DateUtil.getCurrentTime();
			}
			Date endTime=DateUtil.getEndDate(startTime);
			List<Course> courses= courseMapperExt.queryCourse(storeId, startTime, endTime);
			for(Course course:courses){
				if(course.getState()==UserCoursePlan.STATE_ORDER){
					course.setStateStr("已预约");
					continue;
				}
				if(course.getState()==UserCoursePlan.STATE_QUEUE){
					course.setStateStr("已排队");
					continue;
				}
				if(DateUtil.getMarginSeconds(course.getStartTime() ,DateUtil.getEndDate(new Date()))>=60*60*24*2){//2天后的不能选
					Date courseDate=DateUtil.parseDate(coursrTime);
					Date date=DateUtil.addDay(courseDate, -2);
					String dayStr="周"+DateUtil.getWeekChinese(date);
					course.setState(UserCoursePlan.STATE_LIMIT);
					course.setStateStr(dayStr+"开放预约");
					continue;
				}
				if(course.getMaxStock()-course.getStock()>0){
					course.setState(UserCoursePlan.STATE_CAN_ORDER);
					course.setStateStr("预约");
					continue;
				}
				course.setState(UserCoursePlan.STATE_CAN_QUEUE);
				course.setStateStr("排队");
			}
			return courses;
		} catch (ParseException e) {
			log.error("时间类型转换错误");
			return null;
		}
	}
	
	@Override
	public JSONObject getStoreInfo(Integer cityId) {
		JSONObject json=new JSONObject();
		List<DateInfo> weeks=DateUtil.getWeekDates();
		 List<Store> stores=storeMapperExt.queryByAreaId(cityId);
		json.put("weeks", weeks);
		json.put("stores", stores);
		json.put("citys",  getCitys());
		return json;
	}

	private JSONArray getCitys(){
		JSONObject json=new JSONObject();
		json.put("id", 12597);
		json.put("name","杭州");
		JSONArray array=new JSONArray();
		array.add(json);
		return array;
	}

	@Override
	public Course getCourseInfo(Integer courseplanId) {
		CoursePlan coursePlan=coursePlanMapperExt.selectByPrimaryKey(courseplanId);
		com.dasx.fitness.entity.Course course=courseMapperExt.selectByPrimaryKey(coursePlan.getCourseId());
		Course courseDTO=new Course();
		courseDTO.setCourseName(course.getCourseName());
		courseDTO.setClassroom(course.getClassroom());
		courseDTO.setStartTimeStr(DateUtil.getDateTimeString(coursePlan.getStartTime()));
		courseDTO.setEndTimeStr(DateUtil.getDateTimeString(coursePlan.getEndTime()));
		courseDTO.setTrainLevel(course.getTrainLevel());
		if(coursePlan.getMaxStock()-coursePlan.getStock()>0){
			courseDTO.setState(UserCoursePlan.STATE_CAN_ORDER);
		}else{
			courseDTO.setState(UserCoursePlan.STATE_CAN_QUEUE);
		}
		courseDTO.setRemark(course.getRemark());
		List<CourseComment>  comments=courseCommentMapperExt.queryCourseComments(coursePlan.getCourseId());
		return null;
	}
	
	
}
