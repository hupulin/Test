package com.xmkj.applibrary.domain.pet;

import java.io.Serializable;

import lombok.Data;

@Data

public class PayInfo implements Serializable {

    /**
     * result : {"mergerAddress":"湖北省武汉市江夏区新坡哦色色二二丁敏明","purchaseRole":1,"addTime":1567065673,"cityCode":"420100","freight":0,"shippingType":3,"sellerName":null,"purchaseOrderItem":{"birthday":1564935288,"petGrade":1,"thumbnail":"https://tabaooss.oss-cn-beijing.aliyuncs.com/android-app.png","gender":null,"price":911539,"parasiteNum":3,"commodityId":41,"purchaseOrderItemId":20,"commodityCategoryName":"贵宾","vaccineNum":2,"commodityName":"贵宾","commodityCategoryKey":"1001-1016-1018-1315-"},"buyerId":18,"commodityPaymentMethod":2,"couponAmount":null,"sellerId":9,"contactNumber":"18758168676","state":1,"amount":911539,"orderNo":190829020000274,"consignee":"破poor","address":"新坡哦色色二二丁敏明","provinceCode":"420000","wxpayResult":{"appId":"wxa148b3a9d52e3f1e","sign":"9BE4C1624E66D65DC1BF52DEA31F3B58","prepayId":"wx29160114308545d036963ec01910797900","partnerId":"1518969471","nonce":"7578887f39164c9186fcde93115d0195","timestamp":1567065674},"buyerName":"它宝测试","areaCode":"420115","commodityAmount":911539,"purchaseOrderId":20,"alipayResult":null}
     */
    private ResultEntity result;

    @Data

    public class ResultEntity implements Serializable {
        /**
         * mergerAddress : 湖北省武汉市江夏区新坡哦色色二二丁敏明
         * purchaseRole : 1
         * addTime : 1567065673
         * cityCode : 420100
         * freight : 0
         * shippingType : 3
         * sellerName : null
         * purchaseOrderItem : {"birthday":1564935288,"petGrade":1,"thumbnail":"https://tabaooss.oss-cn-beijing.aliyuncs.com/android-app.png","gender":null,"price":911539,"parasiteNum":3,"commodityId":41,"purchaseOrderItemId":20,"commodityCategoryName":"贵宾","vaccineNum":2,"commodityName":"贵宾","commodityCategoryKey":"1001-1016-1018-1315-"}
         * buyerId : 18
         * commodityPaymentMethod : 2
         * couponAmount : null
         * sellerId : 9
         * contactNumber : 18758168676
         * state : 1
         * amount : 911539
         * orderNo : 190829020000274
         * consignee : 破poor
         * address : 新坡哦色色二二丁敏明
         * provinceCode : 420000
         * wxpayResult : {"appId":"wxa148b3a9d52e3f1e","sign":"9BE4C1624E66D65DC1BF52DEA31F3B58","prepayId":"wx29160114308545d036963ec01910797900","partnerId":"1518969471","nonce":"7578887f39164c9186fcde93115d0195","timestamp":1567065674}
         * buyerName : 它宝测试
         * areaCode : 420115
         * commodityAmount : 911539
         * purchaseOrderId : 20
         * alipayResult : null
         */
        private String mergerAddress;
        private int purchaseRole;
        private int addTime;
        private String cityCode;
        private int freight;
        private int shippingType;
        private String sellerName;
        private PurchaseOrderItemEntity purchaseOrderItem;
        private int buyerId;
        private int commodityPaymentMethod;
        private int couponAmount;
        private int sellerId;
        private String contactNumber;
        private int state;
        private long amount;

        public String getFreight() {
            return "￥" + freight / 100;

        }

//        public String getCouponAmount() {
//            return "-￥" + couponAmount/100;
//
//        }

        private long orderNo;
        private String consignee;
        private String address;
        private String provinceCode;
        private WxpayResultEntity wxpayResult;
        private String buyerName;
        private String areaCode;
        private String commodityAmount;
        private int purchaseOrderId;
        private String alipayResult;
        public String getCommodityAmount() {
            return "￥" + commodityAmount.substring(0, commodityAmount.length() - 2);
        }



        @Data
        public class PurchaseOrderItemEntity implements Serializable {
            /**
             * birthday : 1564935288
             * petGrade : 1
             * thumbnail : https://tabaooss.oss-cn-beijing.aliyuncs.com/android-app.png
             * gender : null
             * price : 911539
             * parasiteNum : 3
             * commodityId : 41
             * purchaseOrderItemId : 20
             * commodityCategoryName : 贵宾
             * vaccineNum : 2
             * commodityName : 贵宾
             * commodityCategoryKey : 1001-1016-1018-1315-
             */
            private long birthday;
            private int petGrade;
            private String thumbnail;
            private int gender;
            private long price;
            private int parasiteNum;
            private int commodityId;
            private int purchaseOrderItemId;
            private String commodityCategoryName;
            private int vaccineNum;
            private String commodityName;
            private String commodityCategoryKey;


        }

        @Data
        public class WxpayResultEntity implements Serializable {
            /**
             * appId : wxa148b3a9d52e3f1e
             * sign : 9BE4C1624E66D65DC1BF52DEA31F3B58
             * prepayId : wx29160114308545d036963ec01910797900
             * partnerId : 1518969471
             * nonce : 7578887f39164c9186fcde93115d0195
             * timestamp : 1567065674
             */
            private String appId;
            private String sign;
            private String prepayId;
            private String partnerId;
            private String nonce;
            private String timestamp;


        }
    }
}
