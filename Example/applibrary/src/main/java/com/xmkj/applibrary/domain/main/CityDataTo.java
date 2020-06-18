package com.xmkj.applibrary.domain.main;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class CityDataTo implements Serializable {
    /**
     * code : 110000
     * name : 北京市
     * children :
     */
    private String code;
    private String name;
    private List<CityDataTo> children;
}
