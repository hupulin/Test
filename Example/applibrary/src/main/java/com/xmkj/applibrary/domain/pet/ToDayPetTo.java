package com.xmkj.applibrary.domain.pet;

import com.xmkj.applibrary.R;

import lombok.Data;

@Data
public class ToDayPetTo {
    private String name="阿拉斯加";
    private String address="北京市";
    private String price="200";
    private String originPrice="30";
    private boolean isCheck;
    private int CoverImage= R.mipmap.background_pet;
}
