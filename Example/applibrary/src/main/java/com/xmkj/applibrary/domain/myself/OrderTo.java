package com.xmkj.applibrary.domain.myself;

import lombok.Data;

@Data
public class OrderTo {


    public String getOriginAmount() {
        return originAmount/100+"";
    }

    public void setOriginAmount(int originAmount) {
        this.originAmount = originAmount;
    }

    /**
     * originAmount : 1
     * courseName :
     * amount : 1
     * orderNo : 1
     * payAmount : 1
     * coverImage :
     * cardCouponAmount : 1
     * multi : false
     */
    private int originAmount;
    private String courseName;
    private int amount;
    private String orderNo;
    private int courseId;
    private int payAmount;
    private String coverImage;
    private int cardCouponAmount;
    private boolean multi;

    public String getAmount() {
        return amount/100+"";
    }
    public String getCardCouponAmount() {
        return cardCouponAmount/100+"";
    }

    public String getPayAmount() {
        return payAmount/100+"";

    }
}
