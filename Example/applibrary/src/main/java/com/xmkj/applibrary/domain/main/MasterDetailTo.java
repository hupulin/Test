package com.xmkj.applibrary.domain.main;

import java.util.List;

import lombok.Data;

@Data
public class MasterDetailTo {


    /**
     * result : {"teacherId":4,"attachments":[{"subReferenceId":null,"subCategory":"1","fileStorageId":null,"fileUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190530990050235.png","attachmentId":46,"category":"teacher","referenceId":4,"fileStorageType":null},{"subReferenceId":null,"subCategory":"1","fileStorageId":null,"fileUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190530990050326.png","attachmentId":47,"category":"teacher","referenceId":4,"fileStorageType":null},{"subReferenceId":null,"subCategory":"1","fileStorageId":null,"fileUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190530990050554.jpg","attachmentId":48,"category":"teacher","referenceId":4,"fileStorageType":null}],"teacherName":"王五","courseQty":1,"addOn":1559200138,"teacherTel":"15171450726","coverImage":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190530990050188.png","description":"测试讲师","sysUserId":null,"teacherTitle":"高级讲师1"}
     */

    private ResultEntity result;

    @Data

    public class ResultEntity {
        /**
         * teacherId : 4
         * attachments : [{"subReferenceId":null,"subCategory":"1","fileStorageId":null,"fileUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190530990050235.png","attachmentId":46,"category":"teacher","referenceId":4,"fileStorageType":null},{"subReferenceId":null,"subCategory":"1","fileStorageId":null,"fileUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190530990050326.png","attachmentId":47,"category":"teacher","referenceId":4,"fileStorageType":null},{"subReferenceId":null,"subCategory":"1","fileStorageId":null,"fileUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190530990050554.jpg","attachmentId":48,"category":"teacher","referenceId":4,"fileStorageType":null}]
         * teacherName : 王五
         * courseQty : 1
         * addOn : 1559200138
         * teacherTel : 15171450726
         * coverImage : https://tabaooss.oss-cn-beijing.aliyuncs.com/190530990050188.png
         * description : 测试讲师
         * sysUserId : null
         * teacherTitle : 高级讲师1
         */
        private String teacherId;
        private List<AttachmentsEntity> attachments;
        private String teacherName;
        private int courseQty;
        private int addOn;
        private String teacherTel;
        private String coverImage;
        private String teacherImage;
        private String description;
        private String sysUserId;
        private String teacherTitle;

      @Data
        public class AttachmentsEntity {
            /**
             * subReferenceId : null
             * subCategory : 1
             * fileStorageId : null
             * fileUrl : https://tabaooss.oss-cn-beijing.aliyuncs.com/190530990050235.png
             * attachmentId : 46
             * category : teacher
             * referenceId : 4
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
}
