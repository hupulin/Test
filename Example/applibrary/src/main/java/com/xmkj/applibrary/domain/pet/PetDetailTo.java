package com.xmkj.applibrary.domain.pet;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class PetDetailTo  implements Serializable{
    /**
     * birthday : 1
     * shop : {"shopStar":1,"address":"","evaluationList":[{"score":1,"attachments":[{"fileUrl":""}],"headImage":"","orderEvaluationId":1,"anonymous":false,"hasImage":false,"commentContent":"","buyerId":1,"buyerName":"","commentTime":1}],"shopName":"","shopId":1,"sellerType":1,"tags":[{"shopTagId":1,"tagText":""}]}
     * attachments : [{"fileUrl":""}]
     * parasiteNum : 1
     * petList : [{"thumbnail":"","sellerId":1,"cityName":"","price":1,"cityCode":"","linePrice":1,"sellerName":"","commodityId":1,"sellerType":1,"joinPlatformPromotion":false,"commodityName":"","stockCount":1}]
     * linePrice :
     * inCityFreight : 1
     * commodityId : 1
     * video : {"fileStorageId":1}
     * selfCommodity : false
     * petGrade : 1
     * price : 1
     * couponList : [{"couponName":"","useStartTime":1,"commodityId":1,"couponId":1,"type":1,"commodityCategoryName":"","commodityCategoryKey":"","useEndTime":1,"couponAmount":1,"hadReceived":false,"commodityScope":1,"limitOrderAmount":1,"commodityName":""}]
     * outCityFreight : 1
     * selfTakeFreight : 1
     * joinPlatformPromotion :
     * addTime : 1
     * vaccineNum : 1
     * commodityName :
     * stockCount : 1
     */
    private long birthday;
    private ShopEntity shop;
    private List<AttachmentsEntity> attachments;
    private int parasiteNum;
    private List<PetListEntity> petList;
    private String linePrice;
    private int inCityFreight;
    private int commodityId;
    private int gender;
    private VideoEntity video;
    private boolean selfCommodity;
    private boolean commodityFavorite;
    private int petGrade;
    private String price;
    private List<CouponListEntity> couponList;
    private int outCityFreight;
    private String sellerId;

    public int getInCityFreight() {
        return inCityFreight / 100;
    }

    public int getOutCityFreight() {
        return outCityFreight / 100;
    }

    public int getSelfTakeFreight() {
        return selfTakeFreight / 100;
    }

    private int selfTakeFreight;
    private int pageViews;
    private boolean joinPlatformPromotion;
    private long addTime;
    private int vaccineNum;
    private String commodityName;
    private String commodityCategoryName;
    private int stockCount;

    public String getPrice() {
        return "￥" + price.substring(0, price.length() - 2);

    }

    public String getLinePrice() {
        return "￥" + linePrice.substring(0, linePrice.length() - 2);

    }

    @Data
    public class ShopEntity {
        /**
         * shopStar : 1
         * address :
         * evaluationList : [{"score":1,"attachments":[{"fileUrl":""}],"headImage":"","orderEvaluationId":1,"anonymous":false,"hasImage":false,"commentContent":"","buyerId":1,"buyerName":"","commentTime":1}]
         * shopName :
         * shopId : 1
         * sellerType : 1
         * tags : [{"shopTagId":1,"tagText":""}]
         */
        private int shopStar;
        private String address;
        private String logoImage;
        private List<EvaluationListEntity> evaluationList;
        private String shopName;
        private String shopId;
        private int sellerType;
        private List<TagsEntity> tags;

        @Data

        public class EvaluationListEntity {
            /**
             * score : 1
             * attachments : [{"fileUrl":""}]
             * headImage :
             * orderEvaluationId : 1
             * anonymous : false
             * hasImage : false
             * commentContent :
             * buyerId : 1
             * buyerName :
             * commentTime : 1
             */
            private int score;
            private List<AttachmentsEntity> attachments;
            private String headImage;
            private int orderEvaluationId;
            private boolean anonymous;
            private boolean hasImage;
            private String commentContent;
            private int buyerId;
            private String buyerName;
            private long commentTime;

            @Data

            public class AttachmentsEntity {
                /**
                 * fileUrl :
                 */
                private String fileUrl;


            }
        }

        @Data

        public class TagsEntity {
            /**
             * shopTagId : 1
             * tagText :
             */
            private int shopTagId;
            private String tagText;

        }
    }

    @Data

    public class AttachmentsEntity {
        /**
         * fileUrl :
         */
        private String fileUrl;

    }

    @Data

    public class PetListEntity {
        /**
         * thumbnail :
         * sellerId : 1
         * cityName :
         * price : 1
         * cityCode :
         * linePrice : 1
         * sellerName :
         * commodityId : 1
         * sellerType : 1
         * joinPlatformPromotion : false
         * commodityName :
         * stockCount : 1
         */
        private String thumbnail;
        private int sellerId;
        private String cityName;
        private String price;
        private String cityCode;
        private int linePrice;
        private String sellerName;
        private int commodityId;
        private int sellerType;
        private boolean joinPlatformPromotion;
        private boolean isNewCommodity;
        private String commodityName;
        private String commodityCategoryName;
        private int stockCount;

        public String getPrice() {
            return "￥" + price.substring(0, price.length() - 2);

        }
    }

    @Data

    public class VideoEntity {
        /**
         * fileStorageId : 1
         */
        private String fileStorageId;


    }

    @Data
    public class CouponListEntity {
        /**
         * couponName :
         * useStartTime : 1
         * commodityId : 1
         * couponId : 1
         * type : 1
         * commodityCategoryName :
         * commodityCategoryKey :
         * useEndTime : 1
         * couponAmount : 1
         * hadReceived : false
         * commodityScope : 1
         * limitOrderAmount : 1
         * commodityName :
         */
        private String couponName;
        private long useStartTime;
        private int commodityId;
        private int couponId;
        private int type;
        private String commodityCategoryName;
        private String commodityCategoryKey;
        private long useEndTime;
        private int couponAmount;
        private boolean hadReceived;
        private int commodityScope;
        private int limitOrderAmount;
        private String commodityName;


    }
}

