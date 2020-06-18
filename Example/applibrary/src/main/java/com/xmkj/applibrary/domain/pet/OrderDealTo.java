package com.xmkj.applibrary.domain.pet;

import lombok.Data;

@Data
public class OrderDealTo {

    /**
     * result : {"mergerAddress":"湖北省武汉市江夏区新坡哦色色二二丁敏明","purchaseRole":1,"addTime":1567398165,"cityCode":"420100","freight":0,"shippingType":3,"sellerName":"o8SzSTPKYA","purchaseOrderItem":{"birthday":1540130751,"petGrade":2,"thumbnail":"https://tabaooss.oss-cn-beijing.aliyuncs.com/android-app.png","gender":1,"price":100,"parasiteNum":1,"commodityId":2278,"purchaseOrderItemId":47,"commodityCategoryName":"吉娃娃","vaccineNum":2,"commodityName":"吉娃娃","commodityCategoryKey":"1001-1016-1018-1319-"},"buyerId":18,"commodityPaymentMethod":null,"couponAmount":null,"sellerId":27,"contactNumber":"18758168676","state":5,"amount":100,"orderNo":190902020010176,"consignee":"破poor","address":"新坡哦色色二二丁敏明","provinceCode":"420000","wxpayResult":null,"buyerName":"它宝测试","areaCode":"420115","commodityAmount":100,"purchaseOrderId":47,"alipayResult":null}
     */
    private ResultEntity result;

    @Data

    public class ResultEntity {
        /**
         * mergerAddress : 湖北省武汉市江夏区新坡哦色色二二丁敏明
         * purchaseRole : 1
         * addTime : 1567398165
         * cityCode : 420100
         * freight : 0
         * shippingType : 3
         * sellerName : o8SzSTPKYA
         * purchaseOrderItem : {"birthday":1540130751,"petGrade":2,"thumbnail":"https://tabaooss.oss-cn-beijing.aliyuncs.com/android-app.png","gender":1,"price":100,"parasiteNum":1,"commodityId":2278,"purchaseOrderItemId":47,"commodityCategoryName":"吉娃娃","vaccineNum":2,"commodityName":"吉娃娃","commodityCategoryKey":"1001-1016-1018-1319-"}
         * buyerId : 18
         * commodityPaymentMethod : null
         * couponAmount : null
         * sellerId : 27
         * contactNumber : 18758168676
         * state : 5
         * amount : 100
         * orderNo : 190902020010176
         * consignee : 破poor
         * address : 新坡哦色色二二丁敏明
         * provinceCode : 420000
         * wxpayResult : null
         * buyerName : 它宝测试
         * areaCode : 420115
         * commodityAmount : 100
         * purchaseOrderId : 47
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
        private String commodityPaymentMethod;
        private String couponAmount;
        private int sellerId;
        private String contactNumber;
        private int state;
        private int amount;
        private long orderNo;
        private String consignee;
        private String address;
        private String provinceCode;
        private String wxpayResult;
        private String buyerName;
        private String areaCode;
        private int commodityAmount;
        private int purchaseOrderId;
        private String alipayResult;

        @Data

        public class PurchaseOrderItemEntity {
            /**
             * birthday : 1540130751
             * petGrade : 2
             * thumbnail : https://tabaooss.oss-cn-beijing.aliyuncs.com/android-app.png
             * gender : 1
             * price : 100
             * parasiteNum : 1
             * commodityId : 2278
             * purchaseOrderItemId : 47
             * commodityCategoryName : 吉娃娃
             * vaccineNum : 2
             * commodityName : 吉娃娃
             * commodityCategoryKey : 1001-1016-1018-1319-
             */
            private int birthday;
            private int petGrade;
            private String thumbnail;
            private int gender;
            private int price;
            private int parasiteNum;
            private int commodityId;
            private int purchaseOrderItemId;
            private String commodityCategoryName;
            private int vaccineNum;
            private String commodityName;
            private String commodityCategoryKey;

        }
    }
}
