package com.xmkj.applibrary.domain.myself;

import lombok.Data;

@Data
public class CourseRecordParam {
    private  String courseId;//课程id
    private  String courseName;//课程名称
    private  String courseItemId;//课程视频id
    private  String courseItemName;//课程视频名称
    private  int learnProgress;//学习进度
    private  Boolean completed;//学习进度


}
