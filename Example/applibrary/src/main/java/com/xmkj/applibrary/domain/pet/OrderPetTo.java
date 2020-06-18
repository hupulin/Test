package com.xmkj.applibrary.domain.pet;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class OrderPetTo  implements Serializable{
    /**
     * totalRecords : 1
     * records : [{"amount":1,"orderNo":1,"addTime":1,"purchaseOrderId":1,"freight":1,"state":1,"evaluated":false,"orderEvaluation":{"score":1,"sellerId":1,"attachments":[{"fileUrl":""}],"headImage":false,"orderEvaluationId":1,"sellerName":1,"anonymous":false,"hasImage":false,"commentContent":"","buyerId":1,"buyerName":"","commentTime":1},"purchaseOrderItem":{"birthday":1,"petGrade":"","thumbnail":"","gender":1,"price":1,"parasiteNum":1,"commodityId":1,"purchaseOrderItemId":1,"commodityCategoryName":"","vaccineNum":1,"commodityName":"","commodityCategoryKey":""}}]
     * nextPage : 1
     * totalPages : 1
     * pageSize : 1
     * prevPage : 1
     * page : 1
     */
    private int totalRecords;
    private List<RecordsEntity> records;
    private int nextPage;
    private int totalPages;
    private int pageSize;
    private int prevPage;
    private int page;



    @Data

    public class RecordsEntity  implements Serializable{
        /**
         * amount : 1
         * orderNo : 1
         * addTime : 1
         * purchaseOrderId : 1
         * freight : 1
         * state : 1
         * evaluated : false
         * orderEvaluation : {"score":1,"sellerId":1,"attachments":[{"fileUrl":""}],"headImage":false,"orderEvaluationId":1,"sellerName":1,"anonymous":false,"hasImage":false,"commentContent":"","buyerId":1,"buyerName":"","commentTime":1}
         * purchaseOrderItem : {"birthday":1,"petGrade":"","thumbnail":"","gender":1,"price":1,"parasiteNum":1,"commodityId":1,"purchaseOrderItemId":1,"commodityCategoryName":"","vaccineNum":1,"commodityName":"","commodityCategoryKey":""}
         */
        private int purchaseOrderId;
        private String orderNo;
        private long addTime;
        private long freight;
        private long amount;
        private boolean evaluated;

        private int state;
        private OrderEvaluationEntity orderEvaluation;
        private PurchaseOrderItemEntity purchaseOrderItem;


        @Data

        public class OrderEvaluationEntity  implements Serializable{
            /**
             * score : 1
             * sellerId : 1
             * attachments : [{"fileUrl":""}]
             * headImage : false
             * orderEvaluationId : 1
             * sellerName : 1
             * anonymous : false
             * hasImage : false
             * commentContent :
             * buyerId : 1
             * buyerName :
             * commentTime : 1
             */
            private int score;
            private int sellerId;
            private List<AttachmentsEntity> attachments;
            private String headImage;
            private int orderEvaluationId;
            private String sellerName;
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

        public class PurchaseOrderItemEntity  implements Serializable{
            /**
             * birthday : 1
             * petGrade :
             * thumbnail :
             * gender : 1
             * price : 1
             * parasiteNum : 1
             * commodityId : 1
             * purchaseOrderItemId : 1
             * commodityCategoryName :
             * vaccineNum : 1
             * commodityName :
             * commodityCategoryKey :
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
    }
}
