package com.xmkj.applibrary.domain.pet;

import java.util.List;

import lombok.Data;

@Data
public class ExpressTo {
    /**
     * result : [{"subReferenceId":null,"subCategory":"1","fileStorageId":null,"fileUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/android-app.png","attachmentId":6158,"category":"shipment","referenceId":7,"fileStorageType":null}]
     */
    private List<ResultEntity> result;

@Data
    public class ResultEntity {
    /**
     * subReferenceId : null
     * subCategory : 1
     * fileStorageId : null
     * fileUrl : https://tabaooss.oss-cn-beijing.aliyuncs.com/android-app.png
     * attachmentId : 6158
     * category : shipment
     * referenceId : 7
     * fileStorageType : null
     */
    private String subReferenceId;
    private String subCategory;
    private String fileStorageId;
    private String fileUrl;
    private int attachmentId;
    private String category;
    private int referenceId;
    private String fileStorageType;

}
}
