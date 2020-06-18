package com.xmkj.applibrary.domain.pet;

import lombok.Data;

@Data
public class PetOrderParam {
    private  String     commodityId;
    private  String     expressAddressId;
    private  String     commodityPaymentMethod;
    private  String     couponReceivedId;
    private  String     commodityShippingMethodId;


}
