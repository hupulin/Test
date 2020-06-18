package com.xmkj.applibrary.domain.myself;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class MemberSellerTo implements Serializable {


    /**
     * shopStar : 1
     * logoImage :
     * orderCountList : [{"count":1,"state":1}]
     * shopName :
     * virtualAmount : 1
     * shopId : 1
     * monthTransactionAmount : 1
     */
    private int shopStar;
    private String logoImage;
    private List<OrderCountListEntity> orderCountResponseModels;
    private String shopName;
    private int virtualAmount;
    private int shopId;
    private int monthTransactionAmount;
    private String briefIntro;

    public int getVirtualAmount() {
        return virtualAmount;
    }

    @Data

    public class OrderCountListEntity implements Serializable {
        /**
         * count : 1
         * state : 1
         */
        private int count;
        private int state;


    }
}
