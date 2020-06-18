package com.xmkj.applibrary.domain.pet;

import java.util.List;

import lombok.Data;

@Data
public class PetMainDataTo {

    /**
     * hotDogCategoryList : [{"image":"","sorted":1,"commodityCategoryName":"","commodityCategoryId":1,"commodityCategoryKey":""}]
     * platformShopPetList : [{"shopStar":1,"logoImage":"","cityName":"","shopName":"","shopId":1,"sellerType":1}]
     * advertisementList : [{"advertisementId":1,"advertisementUrl":"","linkUrl":"","linkType":1}]
     * latestPetList : [{"thumbnail":"","cityName":"","cityCode":"","price":1,"linePrice":1,"commodityId":1,"commodityCategoryName":"","joinPlatformPromotion":false,"commodityCategoryKey":""}]
     * hotCatCategoryList : [{"image":"","sorted":1,"commodityCategoryName":"","commodityCategoryId":1,"commodityCategoryKey":""}]
     * platformPromotionPetList : [{"thumbnail":"","cityName":"","cityCode":"","price":1,"linePrice":1,"commodityId":1,"commodityCategoryName":"","joinPlatformPromotion":false,"commodityCategoryKey":""}]
     */
    private List<HotDogCategoryListEntity> hotDogCategoryList;//热门狗品种
    private List<PlatformPetListEntity> platformPetList;//优选宠物
    private List<PlatformShopPetListEntity> platformShopPetList;//优选商家
    private List<AdvertisementListEntity> advertisementList;//广告
    private List<LatestPetListEntity> latestPetList;//最新上架的宠物
    private List<HotCatCategoryListEntity> hotCatCategoryList;//热门狗品种
    private List<PlatformPromotionPetListEntity> platformPromotionPetList;//今日特价

    @Data

    public class HotDogCategoryListEntity {
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

    public class PlatformShopPetListEntity {
        /**
         * shopStar : 1
         * logoImage :
         * cityName :
         * shopName :
         * shopId : 1
         * sellerType : 1
         */
        private int shopStar;
        private String logoImage;
        private String cityName;
        private String shopName;
        private int shopId;
        private int sellerType;


    }

    @Data

    public class AdvertisementListEntity {
        /**
         * advertisementId : 1
         * advertisementUrl :
         * linkUrl :
         * linkType : 1
         */
        private int advertisementId;
        private String advertisementUrl;
        private int advertisementPosition;
        private String linkUrl;
//        private int linkType;


    }

    @Data
    public class LatestPetListEntity {
        /**
         * thumbnail :
         * cityName :
         * cityCode :
         * price : 1
         * linePrice : 1
         * commodityId : 1
         * commodityCategoryName :
         * joinPlatformPromotion : false
         * commodityCategoryKey :
         */
        private String thumbnail;
        private String cityName;
        private int stockCount;

        private String cityCode;
        private long upTime;
        private String price;
        private int linePrice;
        private int commodityId;
        private String commodityCategoryName;
        private boolean joinPlatformPromotion;
        private String commodityCategoryKey;
        private boolean newCommodity;

        public String getPrice() {
            return "￥" + price.substring(0, price.length() - 2);

        }

    }

    @Data

    public class HotCatCategoryListEntity {
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
    public class PlatformPromotionPetListEntity {
        /**
         * thumbnail :
         * cityName :
         * cityCode :
         * price : 1
         * linePrice : 1
         * commodityId : 1
         * commodityCategoryName :
         * joinPlatformPromotion : false
         * commodityCategoryKey :
         */
        private String thumbnail;
        private String cityName;
        private String cityCode;
        private int stockCount;

        private boolean newCommodity;

        private String   price;

        public String getPrice() {
            return "￥" + price.substring(0, price.length() - 2);

        }

        private String linePrice;

        public String getLinePrice() {
            return "￥" + linePrice.substring(0, linePrice.length() -2 );
        }

        private String commodityId;
        private String commodityCategoryName;
        private boolean joinPlatformPromotion;
        private String commodityCategoryKey;


    }

    @Data
    public class PlatformPetListEntity {

        /**
         * thumbnail :
         * cityName :
         * cityCode :
         * price : 1
         * linePrice : 1
         * commodityId : 1
         * commodityCategoryName :
         * newCommodity : false
         * joinPlatformPromotion : false
         * commodityCategoryKey :
         */
        private String thumbnail;
        private String cityName;
        private String cityCode;
        private int stockCount;

        private String price;
        private int linePrice;
        private int actualSales;
        private int commodityId;
        private String commodityCategoryName;
        private boolean newCommodity;
        private boolean joinPlatformPromotion;
        private String commodityCategoryKey;
        public String getPrice() {
            return "￥" + price.substring(0, price.length() - 2);

        }


    }
}
