package com.xmkj.applibrary.domain.pet;

import java.util.List;

import lombok.Data;

@Data
public class PetManageTo {


    /**
     * birthday : 1572451200000
     * attachments : [{"fileUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/191101990002087.png"},{"fileUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/191101990002196.png"}]
     * gender : 2
     * addTime : 1572600260
     * parasiteNum : 0
     * petList : []
     * linePrice : 1000000
     * inCityFreight : 46700
     * commodityId : 3053
     * commodityCategoryName : 布偶猫
     * commodityCategoryKey : 1001-1017-1202-1487-
     * petGrade : 2
     * sellerId : 59
     * pageViews : 0
     * price : 9000
     * couponList : []
     * outCityFreight : 36900
     * selfTakeFreight : 799700
     * joinPlatformPromotion : true
     * vaccineNum : 0
     */
    private long birthday;
    private List<AttachmentsEntity> attachments;
    private VideoEntity video;
    private int gender;
    private String addTime;
    private int parasiteNum;
    private int linePrice;
    private int inCityFreight;
    private String commodityId;
    private String commodityCategoryName;
    private String commodityCategoryKey;
    private int petGrade;
    private String sellerId;
    private int pageViews;
    private int price;
    private int outCityFreight;
    private int selfTakeFreight;
    private boolean joinPlatformPromotion;
    private int vaccineNum;


    @Data
    public class AttachmentsEntity {
        /**
         * fileUrl : https://tabaooss.oss-cn-beijing.aliyuncs.com/191101990002087.png
         */
        private String fileUrl;


    }

    @Data
    public class VideoEntity {
        /**
         * fileUrl : https://tabaooss.oss-cn-beijing.aliyuncs.com/191101990002087.png
         */
        private String fileStorageId;


    }
}
