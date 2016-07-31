package com.dasx.fitness.entity;

public class Course {
    private Integer courseId;

    private String courseName;

    private Integer storeId;

    private Byte type;

    private Integer coachId;

    private String classroom;

    private Integer trainLevel;

    private String logo;

    private String slidePic;

    private String remark;

    private Byte isDelete;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getCoachId() {
        return coachId;
    }

    public void setCoachId(Integer coachId) {
        this.coachId = coachId;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public Integer getTrainLevel() {
        return trainLevel;
    }

    public void setTrainLevel(Integer trainLevel) {
        this.trainLevel = trainLevel;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getSlidePic() {
        return slidePic;
    }

    public void setSlidePic(String slidePic) {
        this.slidePic = slidePic;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}