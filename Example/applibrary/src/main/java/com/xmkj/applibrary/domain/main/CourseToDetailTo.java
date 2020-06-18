package com.xmkj.applibrary.domain.main;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class CourseToDetailTo  implements Serializable {

    /**
     * attachments : [{"subCategory":"3","fileUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190530990030314.jpeg","attachmentId":"38","category":"course","referenceId":"12"}]
     * teacherName : 李四
     * sellerName : 派多格
     * description : 广东佛山输入
     * originPrice : 6600
     * multi : false
     * courseCategoryName : 养宠常识
     * courseName : 个人哈恶化
     * teacherId : 3
     * sellerId : -9999
     * price : 6600
     * coverImage : https://tabaooss.oss-cn-beijing.aliyuncs.com/190530990030169.jpg
     * courseCategoryKey : 2000-2001-2006-
     * hasBought : false
     * state : 1
     * teacherCoverImage : https://tabaooss.oss-cn-beijing.aliyuncs.com/190528990040439.jpg
     * courseId : 12
     * courseItemDtos : [{"sorted":1,"pageViews":0,"coverImage":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190604990000674.jpg","courseItemName":"个人哈恶化","videoTimes":9,"courseId":"12","courseItemId":"12"}]
     */
    private List<AttachmentsEntity> attachments;
    private List<CourseItemDtosEntity> courseItemDtos;
    private List<RelatedCourseEntity> relatedCourseItems;
    private String teacherName;
    private boolean joinPlatformPromotion;
    private String sellerName;
    private String description;
    private String lastCourseItemId;
    private int originPrice;
    private boolean multi;
    private String courseCategoryName;
    private String courseName;
    private String teacherId;
    private int pageViews;
    private String sellerId;
    private int linePrice;

    public String getLinePrice() {
        return linePrice/100+"";
    }

    public String getPrice() {
            return price/100+"";

    }


    private long price;
    private String coverImage;
    private String courseCategoryKey;
    private boolean hasBought;
    private int state;
    private String teacherCoverImage;
    private String courseId;
    @Data
    public class AttachmentsEntity implements Serializable{
        /**
         * subCategory : 3
         * fileUrl : https://tabaooss.oss-cn-beijing.aliyuncs.com/190530990030314.jpeg
         * attachmentId : 38
         * category : course
         * referenceId : 12
         */
        private String subCategory;
        private String fileUrl;
        private String attachmentId;
        private String category;
        private String referenceId;

    }
    @Data
    public class CourseItemDtosEntity implements Serializable {
        /**
         * sorted : 1
         * pageViews : 0
         * coverImage : https://tabaooss.oss-cn-beijing.aliyuncs.com/190604990000674.jpg
         * courseItemName : 个人哈恶化
         * videoTimes : 9
         * courseId : 12
         * courseItemId : 12
         */
        private int sorted;
        private int pageViews;
        private String coverImage;
        private String courseItemName;
        private int videoTimes;
        private int learnProgress;
        private int tryProgress;
        private int maxTimes;
        private String courseId;
        private String videoId;
        private String courseItemId;

    }
    @Data
    public class RelatedCourseEntity implements Serializable {

        /**
         * teacherName : 沈浩
         * addOn : 1569826365
         * headUrl : https://tabaooss.oss-cn-beijing.aliyuncs.com/190925990002215.jpg
         * linePrice : 9900
         * description : 狗狗的护食行为该怎么解决
         * multi : false
         * courseCategoryName : 行为塑造
         * courseName : 狗狗的护食行为该怎么解决
         * teacherId : 11
         * pageViews : 172
         * price : 1900
         * coverImage : https://tabaooss.oss-cn-beijing.aliyuncs.com/190930990032162.png
         * courseCategoryKey : 2000-2003-2009-2012-
         * videoTimes : 248
         * teacherTitle : 高级训犬师
         * teacherCoverImage : https://tabaooss.oss-cn-beijing.aliyuncs.com/190925990002396.jpg
         * courseId : 63
         * joinPlatformPromotion : true
         */
        private String teacherName;
        private String addOn;
        private String headUrl;
        private int linePrice;
        private String description;
        private boolean multi;
        private String courseCategoryName;
        private String courseName;
        private String teacherId;
        private int pageViews;
        private int price;
        private String coverImage;
        private String courseCategoryKey;
        private int videoTimes;
        private String teacherTitle;
        private String teacherCoverImage;
        private String courseId;
        private boolean joinPlatformPromotion;


    }
}
