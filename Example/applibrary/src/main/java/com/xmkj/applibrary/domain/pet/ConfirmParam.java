package com.xmkj.applibrary.domain.pet;

import java.util.List;

import lombok.Data;

@Data
public class ConfirmParam {
    private String orderNo;
    private List<ImagePath> attachments;

    @Data

    public static class ImagePath {
        private String fileUrl;
    }
}
