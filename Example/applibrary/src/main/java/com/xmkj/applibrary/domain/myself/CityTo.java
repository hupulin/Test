package com.xmkj.applibrary.domain.myself;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class CityTo  implements Serializable {
    private String code;
    private String name;

    private List<CityTo> children;

}
