package com.xmkj.applibrary.domain.main;

import lombok.Data;

/**
 * Created by 1ONE on 2019/5/24.
 */
@Data
public class DeviceTo {
    private String name;
    private String des="空气能热水器线控器";
    private int deviceImage;

    public DeviceTo(String name, int deviceImage) {
        this.name = name;
        this.deviceImage = deviceImage;
    }
}
