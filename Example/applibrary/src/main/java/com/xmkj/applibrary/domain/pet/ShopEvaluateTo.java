package com.xmkj.applibrary.domain.pet;


import java.io.Serializable;
import java.util.List;

import lombok.Data;


@Data

public class ShopEvaluateTo implements Serializable {

    /**
     * totalRecords : 0
     * records : [{"score":1,"attachments":[{"fileUrl":""}],"headImage":"","orderEvaluationId":1,"anonymous":false,"hasImage":false,"commentContent":"","buyerId":1,"buyerName":"","commentTime":1}]
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
    public class RecordsEntity {
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
}
