package com.xmkj.applibrary.domain.myself;

import com.xmkj.applibrary.util.DateUtil;

import java.util.List;

import lombok.Data;
@Data

public class CommissionDataTo {

    /**
     * totalRecords : 1
     * records : [{"transactionType":1,"bussinessType":1,"occurAmount":1,"accountTransactionId":1,"transactionOn":1}]
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
         * transactionType : 1
         * bussinessType : 1
         * occurAmount : 1
         * accountTransactionId : 1
         * transactionOn : 1
         */
        private String transactionType;
        private String businessType;

        private long occurAmount;
        private int accountTransactionId;
        private long transactionOn;



    public String getTransactionOn() {
        return DateUtil.longToString(transactionOn*1000, "yyyy-MM-dd HH:mm:ss");
    }
    }

}
