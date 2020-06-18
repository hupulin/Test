package com.xmkj.applibrary.domain.pet;

import lombok.Data;

@Data

public class MainCityTo {

    /**
     * mergerName :
     * nameInitial :
     * cityCode :
     * provinceCode :
     * name :
     * cityId : 1
     * hotCity : false
     */
    private String mergerName;
    private String nameInitial;
    private String cityCode;
    private String provinceCode;
    private String name;
    private int cityId;
    private boolean hotCity;


}
