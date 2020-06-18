package com.xmkj.applibrary.domain.pet;

import com.xmkj.applibrary.R;

import java.util.List;

import lombok.Data;

@Data
public class ShopGoodsTo {


    /**
     * totalRecords : 0
     * records : [{"thumbnail":"","addTime":1,"linePrice":1,"sellerName":"","commodityId":1,"commodityCategoryName":"","commodityCategoryKey":"","upTime":1,"sellerId":1,"price":1,"newCommodity":false,"joinPlatformPromotion":false,"stockCount":1}]
     * nextPage : 0
     * totalPages : 0
     * pageSize : 0
     * prevPage : 0
     * page : 0
     */
    private int totalRecords;
    private List<RecordsEntity> records;
    private int nextPage;
    private int totalPages;
    private int pageSize;
    private int prevPage;
    private int page;

    @Data
    public static class RecordsEntity {
        /**
         * thumbnail :
         * addTime : 1
         * linePrice : 1
         * sellerName :
         * commodityId : 1
         * commodityCategoryName :
         * commodityCategoryKey :
         * upTime : 1
         * sellerId : 1
         * price : 1
         * newCommodity : false
         * joinPlatformPromotion : false
         * stockCount : 1
         */
     private String thumbnail;
        private int addTime;
        private int linePrice;
        private String sellerName;
        private String commodityId;
        private String commodityCategoryName ;
        private String commodityCategoryKey;
        private long upTime;
        private int sellerId;
        private int price;
        private int gender;
        private boolean newCommodity;
        private boolean joinPlatformPromotion;
        private int stockCount;
        private int state;

    }
}
