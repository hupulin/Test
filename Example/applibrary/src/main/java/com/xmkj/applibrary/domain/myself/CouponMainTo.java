package com.xmkj.applibrary.domain.myself;

import java.util.List;

import lombok.Data;

@Data
public class CouponMainTo {

    /**
     * totalRecords : 1
     * records : [{"useEndTime":"","couponName":"","couponAmount":1,"useStartTime":"","state":1}]
     * nextPage : 1
     * totalPages : 1
     * pageSize : 1
     * prevPage : 1
     * page : 1
     */
    private int totalRecords;
    private List<CouponTo> records;
    private int nextPage;
    private int totalPages;
    private int pageSize;
    private int prevPage;
    private int page;


}
