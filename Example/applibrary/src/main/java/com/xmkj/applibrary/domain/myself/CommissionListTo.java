package com.xmkj.applibrary.domain.myself;

import java.util.List;

import lombok.Data;

@Data
public class CommissionListTo {

    /**
     * totalRecords : 1
     * records : [{"agentRecordId":1,"courseName":"","price":1,"coverImage":"","commission":1,"courseId":1,"agentCount":1}]
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
    public class RecordsEntity {
        /**
         * agentRecordId : 1
         * courseName :
         * price : 1
         * coverImage :
         * commission : 1
         * courseId : 1
         * agentCount : 1
         */
        private int agentRecordId;
        private String courseName;
        private int price;
        private String coverImage;
        private long commission;
        private int courseId;
        private int agentCount;


    }
}
