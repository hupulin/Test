package com.xmkj.applibrary.domain.pet;

import java.util.List;

import lombok.Data;

@Data
public class PetAndShopTo {


    /**
     * commodityCategoryList : [{"image":"","sorted":1,"commodityCategoryName":"","commodityCategoryId":1,"commodityCategoryKey":""}]
     * shopList : [{"shopStar":1,"address":"","logoImage":"","cityName":"","areaName":"","shopName":"","shopId":1,"provinceName":"","sellerType":1}]
     */
    private List<CommodityCategoryListEntity> commodityCategoryList;
    private List<ShopListEntity> shopItfaceResponseModels;

    @Data

    public class CommodityCategoryListEntity {
        /**
         * image :
         * sorted : 1
         * commodityCategoryName :
         * commodityCategoryId : 1
         * commodityCategoryKey :
         */
        private String image;
        private int sorted;
        private String commodityCategoryName;
        private int commodityCategoryId;
        private String commodityCategoryKey;


    }

    @Data

    public class ShopListEntity {


        /**
         * shopStar : 3
         * address : 华夏学院旁边
         * provinceCode : 420000
         * cityCode : 420100
         * groupId : 8
         * shopName : 光谷店
         * ownerId : 18
         * areaCode : 420111
         * sellerId : 8
         * logoImage : https://tabaooss.oss-cn-beijing.aliyuncs.com/190822990000328.jpg
         * cityName : 武汉市
         * mergerName : 湖北省武汉市洪山区
         * areaName : 洪山区
         * shopId : 5
         * state : 1
         * provinceName : 湖北省
         * sellerType : 1
         * briefIntro : 你的也破在我婆婆很放松的空间和纳斯达克两件事的
         * actualSales : 0
         */
        private int shopStar;
        private String address;
        private String provinceCode;
        private String cityCode;
        private String groupId;
        private String shopName;
        private String ownerId;
        private String areaCode;
        private String sellerId;
        private String logoImage;
        private String cityName;
        private String mergerName;
        private String areaName;
        private String shopId;
        private int state;
        private String provinceName;
        private int sellerType;
        private String briefIntro;
        private int actualSales;

    }
}
