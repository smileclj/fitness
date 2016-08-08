package com.dasx.fitness.controller.weixin;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.dasx.fitness.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.dasx.fitness.common.enums.ErrorCode;
import com.dasx.fitness.common.exceptions.FitnessException;
import com.dasx.fitness.common.resp.BaseResp;
import com.dasx.fitness.common.util.StringUtil;
import com.dasx.fitness.dto.course.Course;
import com.dasx.fitness.service.CourseService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController extends BaseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "queryCourses")
    public BaseResp queryCourses(HttpServletRequest request,
                                 HttpServletResponse response, Integer areaId, Integer storeId, String courseTime) throws IOException {
        if (storeId == null || StringUtil.isEmpty(courseTime)) {
            throw new FitnessException(ErrorCode.ERROR_PARAM);
        }
        List<Course> course = courseService.queryCourse(storeId, courseTime);
        return succeed(course);

    }

    @RequestMapping(value = "getStoresInfo")
    public BaseResp getStoresInfo(HttpServletRequest request,
                                  HttpServletResponse response, Integer cityId) throws IOException {
        return succeed(courseService.getStoreInfo(1));
    }
}
