package com.xmkj.applibrary.domain.pet;

import lombok.Data;

@Data
public class ReleasedLimitTo {

    /**
     * upAmount : 500
     * totalUpNum : 100
     * amount : 500
     * freeUpCount : 0
     * totalMallPromotionNum : 50
     * freeQuota : 0
     * sellerType : 1
     * type : 1
     */
    private int totalUpNum;//上架数量
    private int totalMallPromotionNum;//特惠数量

//    private int amount;
//    private int freeQuota;
//        private int type;

    private int sellerType;//商家类型：1-个人 2-商家 3-平台




    private int upAmount;//发布单价
    private int freeUpCount;//赠送发布数量


    /**
     * totalUpNum : 100
     * amount : 200
     * freeRefreshCount : 1
     * refreshAmount : 200
     * totalMallPromotionNum : 50
     * freeQuota : 200
     * sellerType : 1
     * type : 2
     */

    private int freeRefreshCount;//赠送顶帖数量
    private int refreshAmount;//顶帖单价



}
