package com.xmkj.applibrary.domain.pet;

import java.util.List;

import lombok.Data;

@Data
public class EvaluateParam {
    private String orderNo;
    private String commentContent;
    private String score;
    private boolean anonymous;
    private List<ImagePath> attachments;

    @Data

    public static class ImagePath {
        private String fileUrl;
    }
}
