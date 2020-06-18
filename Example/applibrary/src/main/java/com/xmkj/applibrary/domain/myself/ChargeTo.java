package com.xmkj.applibrary.domain.myself;

import lombok.Data;

@Data
public class ChargeTo {

    /**
     * donateAmount :  赠送金额
     * rechargeAmount : 储值金额
     * rechargePromotionId :
     */
    private String donateAmount;
    private int rechargeAmount;
    private String rechargePromotionId;
    private String name;
    private Boolean click;

    public String getRechargeAmount() {
        return rechargeAmount/100+"";
    }
}
