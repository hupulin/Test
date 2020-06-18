package com.xmkj.applibrary.domain.main;

import lombok.Data;

@Data
public class CourseTo {

    /**
     * courseId : 1
     * teacherId : 1
     * courseName :
     * coverImage :
     * description :
     * price : 1
     * teacherName :
     * courseCategoryKey :
     * courseCategoryName :
     * multi : false
     * pageViews : 1
     * videoTimes : 1
     * teacherTitle :
     */

    private int courseId;
    private int teacherId;
    private String courseName;
    private String coverImage;
    private String teacherCoverImage;
    private String description;
    private int price;
    private int linePrice;
    private String teacherName;
    private String courseCategoryKey;
    private String courseCategoryName;
    private boolean multi;
    private boolean joinPlatformPromotion;
    private int pageViews;
    private int videoTimes;
    private String teacherTitle;

    public int getPrice() {
        return price/100;
    }

    public int getLinePrice() {
        return linePrice/100;

    }
}
