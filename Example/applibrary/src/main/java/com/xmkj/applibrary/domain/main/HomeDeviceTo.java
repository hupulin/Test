package com.xmkj.applibrary.domain.main;

import lombok.Data;

/**
 * Created by 1ONE on 2019/5/24.
 */
@Data
public class HomeDeviceTo {
    private String name;
    private int deviceImage;

    public HomeDeviceTo(String name, int deviceImage) {
        this.name = name;
        this.deviceImage = deviceImage;
    }
}
