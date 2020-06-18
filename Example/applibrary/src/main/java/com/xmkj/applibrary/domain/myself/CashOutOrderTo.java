package com.xmkj.applibrary.domain.myself;

import lombok.Data;

@Data
public class CashOutOrderTo {


    /**
     * result : {"amount":10,"orderNo":190729100020479,"sellerId":-1,"payTime":1564371463,"sellerName":null,"withdrawId":24,"state":2,"withdrawTime":1564371461,"buyerId":525,"buyerName":null}
     */
    private ResultEntity result;


    @Data
    public class ResultEntity {
        /**
         * amount : 10
         * orderNo : 190729100020479
         * sellerId : -1
         * payTime : 1564371463
         * sellerName : null
         * withdrawId : 24
         * state : 2
         * withdrawTime : 1564371461
         * buyerId : 525
         * buyerName : null
         */
        private long amount;
        private long orderNo;
        private int sellerId;
        private long payTime;
        private String sellerName;
        private int withdrawId;
        private String state;
        private long withdrawTime;
        private int buyerId;
        private String buyerName;


    }
}
