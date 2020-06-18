package com.xmkj.applibrary.domain.pet;

import lombok.Data;

@Data
public class AddPetParam {

    private String commodityCategoryKey;
    private String commodityId;
    private long birthday;
    private int gender;//性别：1-公 2-母
    private int petGrade;//品级：1-宠物级 2-血统级
    private int vaccineNum;
    private int parasiteNum;
    private int price;
    private int linePrice;
    private boolean joinPlatformPromotion;
    private int outCityFreight;
    private int inCityFreight;
    private int selfTakeFreight;
    private VideoVid video;
    private String attachmentString;


    @Data
    public static class VideoVid{
        private String fileStorageId;
    }

}