package com.xmkj.applibrary.domain.myself;


import lombok.Data;

@Data
public class ChargeOrderTo {

    /**
     * result : {"donateAmount":1,"amount":"string","orderNo":1,"rechargeAmount":1,"completeOn":"string","rechargeTime":1,"state":1,"completed":false,"buyerId":1,"buyerName":"string","rechargeId":1}
     */
    private ResultEntity result;


    @Data
    public class ResultEntity {
        /**
         * donateAmount : 1
         * amount : string
         * orderNo : 1
         * rechargeAmount : 1
         * completeOn : string
         * rechargeTime : 1
         * state : 1
         * completed : false
         * buyerId : 1
         * buyerName : string
         * rechargeId : 1
         */
        private int donateAmount;
        private String amount;
        private String orderNo;
        private int rechargeAmount;
        private String completeOn;
        private int rechargeTime;
        private int state;
        private boolean completed;
        private int buyerId;
        private String buyerName;
        private int rechargeId;
    }
}
