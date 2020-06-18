package com.xmkj.applibrary.domain.pet;

import java.util.List;

import lombok.Data;

@Data
public class ShipTo {


    /**
     * totalRecords : 3
     * records : [{"shippingMethod":"1","freight":50000,"type":1},{"shippingMethod":"2","freight":20000,"type":2},{"shippingMethod":"3","freight":0,"type":3}]
     * nextPage : 1
     * totalPages : 1
     * pageSize : 10
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
         * shippingMethod : 1
         * freight : 50000
         * type : 1
         */
        private String shippingMethod;
        private int freight;
        private int type;


    }
}
