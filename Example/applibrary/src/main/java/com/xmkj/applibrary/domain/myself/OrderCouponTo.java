package com.xmkj.applibrary.domain.myself;

import java.io.Serializable;

import lombok.Data;

@Data
public class OrderCouponTo implements Serializable{
    /**
     * couponReceivedId :
     * useEndTime :
     * couponName :
     * couponAmount : 1
     * useStartTime :
     */
    private String couponReceivedId;
    private String useEndTime;
    private String couponName;
    private int couponAmount;
    private String useStartTime;
    private boolean select;


}
