package com.xmkj.applibrary.domain.pet;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class PetOrderTo implements Serializable {
    public PetOrderToDetail result;

    @Data
    public class PetOrderToDetail implements Serializable {
        /**
         * birthday : 1
         * amount : 1
         * shop : {"areaCode":"","address":"","cityName":"","areaName":"","provinceCode":"","cityCode":"","shopName":"","shopId":1,"provinceName":""}
         * gender : 1
         * coupon : [{"couponName":"","useStartTime":1,"commodityId":1,"couponId":1,"type":1,"commodityCategoryName":"","commodityCategoryKey":"","couponReceivedId":1,"useEndTime":1,"couponAmount":1,"commodityScope":1,"limitOrderAmount":1,"selected":false,"commodityName":""}]
         * parasiteNum : 1
         * commodityShippingMethodList : [{"freight":"","commodityShippingMethodId":1,"disabled":false,"type":1,"selected":false}]
         * freight : 1
         * commodityId : 1
         * expressAddress : {"areaCode":"","consignee":"","address":"","cityName":"","expressAddressId":1,"areaName":"","provinceCode":"","cityCode":"","contactNumber":"","provinceName":"","defaultAddress":false}
         * petGrade : 1
         * originAmount : 1
         * commodityPaymentMethod : 1
         * couponAmount : 0
         * commodityAmount : 1
         * price : 1
         * vaccineNum : 1
         * commodityName :
         */
        private long birthday;
        private int amount;
        private ShopEntity shop;
        private int gender;
        private List<CouponEntity> coupon;
        private int parasiteNum;
        private List<CommodityShippingMethodListEntity> commodityShippingMethodList;
        private int freight;
        private int commodityId;
        private String thumbnail;
        private ExpressAddressEntity expressAddress;
        private int petGrade;
        private int originAmount;
        private int commodityPaymentMethod;
        private int couponAmount;
        private int commodityAmount;
        private long price;
        private int vaccineNum;
        private String commodityName;

        @Data

        public class ShopEntity {
            /**
             * areaCode :
             * address :
             * cityName :
             * areaName :
             * provinceCode :
             * cityCode :
             * shopName :
             * shopId : 1
             * provinceName :
             */
            private String areaCode;
            private String address;
            private String cityName;
            private String areaName;
            private String provinceCode;
            private String cityCode;
            private String shopName;
            private String mergerName;
            private int shopId;
            private String provinceName;


        }

        @Data

        public class CouponEntity implements Serializable {
            /**
             * couponName :
             * useStartTime : 1
             * commodityId : 1
             * couponId : 1
             * type : 1
             * commodityCategoryName :
             * commodityCategoryKey :
             * couponReceivedId : 1
             * useEndTime : 1
             * couponAmount : 1
             * commodityScope : 1
             * limitOrderAmount : 1
             * selected : false
             * commodityName :
             */
            private String couponName;
            private long useStartTime;
            private int commodityId;
            private int couponId;
            private int type;
            private String commodityCategoryName;
            private String commodityCategoryKey;
            private int couponReceivedId;
            private long useEndTime;
            private int couponAmount;
            private int commodityScope;
            private int limitOrderAmount;
            private boolean selected;
            private boolean click;
            private String commodityName;

        }

        @Data

        public class CommodityShippingMethodListEntity {
            /**
             * freight :
             * commodityShippingMethodId : 1
             * disabled : false
             * type : 1
             * selected : false
             */
            private int freight;
            private int commodityShippingMethodId;
            private boolean disabled;
            private int type;
            private boolean selected;

        }

        @Data
        public class ExpressAddressEntity {
            /**
             * areaCode :
             * consignee :
             * address :
             * cityName :
             * expressAddressId : 1
             * areaName :
             * provinceCode :
             * cityCode :
             * contactNumber :
             * provinceName :
             * defaultAddress : false
             */
            private String areaCode;
            private String consignee;
            private String address;
            private String cityName;
            private int expressAddressId;
            private String areaName;
            private String provinceCode;
            private String cityCode;
            private String contactNumber;
            private String provinceName;
            private String mergerName;
            private boolean defaultAddress;
        }
    }


}
