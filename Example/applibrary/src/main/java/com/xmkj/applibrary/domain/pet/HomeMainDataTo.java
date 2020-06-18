package com.xmkj.applibrary.domain.pet;

import java.util.List;

import lombok.Data;

@Data
public class HomeMainDataTo {

    /**
     * platformShopList : [{"shopStar":3,"logoImage":"https://tabaooss.oss-cn-beijing.aliyuncs.com/shop-logo.png","cityName":"武汉市","shopName":"22号店铺","shopId":"19","sellerType":3},{"shopStar":3,"logoImage":"https://tabaooss.oss-cn-beijing.aliyuncs.com/shop-logo.png","cityName":"武汉市","shopName":"24号店铺","shopId":"21","sellerType":3},{"shopStar":3,"logoImage":"https://tabaooss.oss-cn-beijing.aliyuncs.com/shop-logo.png","cityName":"武汉市","shopName":"28号店铺","shopId":"25","sellerType":3},{"shopStar":3,"logoImage":"https://tabaooss.oss-cn-beijing.aliyuncs.com/shop-logo.png","cityName":"武汉市","shopName":"32号店铺","shopId":"29","sellerType":3}]
     * hotDogCategoryList : [{"image":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190628990030665.png","sorted":1,"commodityCategoryName":"柴犬","commodityCategoryId":"1356","commodityCategoryKey":"1001-1016-1019-1356-"},{"image":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190628990030425.png","sorted":1,"commodityCategoryName":"金毛","commodityCategoryId":"1402","commodityCategoryKey":"1001-1016-1020-1402-"},{"image":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190701990029858.png","sorted":2,"commodityCategoryName":"博美","commodityCategoryId":"1313","commodityCategoryKey":"1001-1016-1018-1313-"},{"image":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190628990050516.png","sorted":2,"commodityCategoryName":"泰迪","commodityCategoryId":"1357","commodityCategoryKey":"1001-1016-1019-1357-"},{"image":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190628990030568.png","sorted":2,"commodityCategoryName":"哈士奇","commodityCategoryId":"1403","commodityCategoryKey":"1001-1016-1020-1403-"},{"image":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190628990043124.png","sorted":3,"commodityCategoryName":"比熊","commodityCategoryId":"1314","commodityCategoryKey":"1001-1016-1018-1314-"},{"image":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190628990050684.png","sorted":3,"commodityCategoryName":"松狮","commodityCategoryId":"1358","commodityCategoryKey":"1001-1016-1019-1358-"},{"image":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190628990051055.png","sorted":3,"commodityCategoryName":"拉布拉多","commodityCategoryId":"1404","commodityCategoryKey":"1001-1016-1020-1404-"}]
     * teacherList : [{"teacherId":"2","attachments":[{"subCategory":"1","fileUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190528990020223.png","attachmentId":"181","category":"teacher","referenceId":"2"},{"subCategory":"1","fileUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190621990000144.jpg","attachmentId":"182","category":"teacher","referenceId":"2"},{"subCategory":"1","fileUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190621990000235.jpg","attachmentId":"183","category":"teacher","referenceId":"2"}],"teacherName":"张三","courseQty":0,"addOn":"1559028552","teacherTel":"18814121274","coverImage":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190528990040563.jpg","description":"测试讲师测试讲师","teacherTitle":"高级宠物训导师"},{"teacherId":"3","attachments":[{"subCategory":"1","fileUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190528990020745.png","attachmentId":"49","category":"teacher","referenceId":"3"},{"subCategory":"1","fileUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190528990020874.png","attachmentId":"50","category":"teacher","referenceId":"3"},{"subCategory":"1","fileUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190528990020984.jpg","attachmentId":"51","category":"teacher","referenceId":"3"},{"subCategory":"1","fileUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190528990040299.png","attachmentId":"52","category":"teacher","referenceId":"3"}],"teacherName":"李四","courseQty":0,"addOn":"1559028624","teacherTel":"15171450726","coverImage":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190528990040439.jpg","description":"测试讲师111111111111111111111111111111111111111111111111111111111","teacherTitle":"高级宠物训导师"},{"teacherId":"4","attachments":[{"subCategory":"1","fileUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190530990050235.png","attachmentId":"46","category":"teacher","referenceId":"4"},{"subCategory":"1","fileUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190530990050326.png","attachmentId":"47","category":"teacher","referenceId":"4"},{"subCategory":"1","fileUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190530990050554.jpg","attachmentId":"48","category":"teacher","referenceId":"4"}],"teacherName":"王五","courseQty":1,"addOn":"1559200138","teacherTel":"15171450726","coverImage":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190530990050188.png","description":"测试讲师","teacherTitle":"高级讲师1"},{"teacherId":"5","attachments":[{"subCategory":"1","fileUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190605990010218.jpg","attachmentId":"147","category":"teacher","referenceId":"5"}],"teacherName":"讲师李强","courseQty":19,"addOn":"1559698247","teacherTel":"18666666665","coverImage":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190605990010183.jpg","description":"哈哈哈哈","teacherTitle":"高级铲屎官"}]
     * advertisementList : [{"advertisementPosition":3,"advertisementId":"20","advertisementUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190603990020532.png"},{"advertisementPosition":3,"advertisementId":"21","advertisementUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190603990020637.png"}]
     * platformPromotionCourseList : [{"courseCategoryName":"常见问题","courseName":"狗狗过度吠叫怎么办","pageViews":0,"price":1500,"coverImage":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190710990012367.png","linePrice":1800,"description":"如何制止狗狗过度吠叫呢？","courseCategoryKey":"2000-2001-2007-","videoTimes":195,"courseId":"40","joinPlatformPromotion":true,"multi":false}]
     * hotCatCategoryList : [{"image":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190628990030889.png","sorted":1,"commodityCategoryName":"英短","commodityCategoryId":"1454","commodityCategoryKey":"1001-1017-1306-1454-"},{"image":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190628990054929.png","sorted":1,"commodityCategoryName":"布偶猫","commodityCategoryId":"1487","commodityCategoryKey":"1001-1017-1202-1487-"},{"image":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190628990030963.png","sorted":2,"commodityCategoryName":"美短","commodityCategoryId":"1455","commodityCategoryKey":"1001-1017-1306-1455-"},{"image":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190628990055034.png","sorted":2,"commodityCategoryName":"波斯猫","commodityCategoryId":"1488","commodityCategoryKey":"1001-1017-1202-1488-"}]
     * platformPromotionPetList : [{"upTime":"1565935029","thumbnail":"https://tabaooss.oss-cn-beijing.aliyuncs.com/android-app.png","cityName":"西安市","cityCode":"610100","price":100,"linePrice":15000,"commodityId":"40","commodityCategoryName":"贵宾","newCommodity":false,"joinPlatformPromotion":true,"commodityCategoryKey":"1001-1016-1018-1315-","actualSales":6},{"upTime":"1565935292","thumbnail":"https://tabaooss.oss-cn-beijing.aliyuncs.com/android-app.png","cityName":"西安市","cityCode":"610100","price":100,"linePrice":979806,"commodityId":"41","commodityCategoryName":"贵宾","newCommodity":false,"joinPlatformPromotion":true,"commodityCategoryKey":"1001-1016-1018-1315-","actualSales":6},{"upTime":"1565935296","thumbnail":"https://tabaooss.oss-cn-beijing.aliyuncs.com/android-app.png","cityName":"西安市","cityCode":"610100","price":100,"linePrice":537836,"commodityId":"42","commodityCategoryName":"贵宾","newCommodity":false,"joinPlatformPromotion":true,"commodityCategoryKey":"1001-1016-1018-1315-","actualSales":6}]
     * recommendCourseList : [{"courseCategoryName":"常见问题","courseName":"狗狗过度吠叫怎么办","pageViews":0,"price":1500,"coverImage":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190710990012367.png","linePrice":1800,"description":"如何制止狗狗过度吠叫呢？","courseCategoryKey":"2000-2001-2007-","videoTimes":195,"courseId":"40","joinPlatformPromotion":true,"multi":false},{"courseCategoryName":"养宠常识","courseName":"测试封面","pageViews":0,"price":12300,"coverImage":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190703990030833.jpg","description":"规划图人","courseCategoryKey":"2000-2001-2006-","videoTimes":9,"courseId":"38","joinPlatformPromotion":false,"multi":true}]
     */
    private List<PlatformShopListEntity> platformShopList;
    private List<HotDogCategoryListEntity> hotDogCategoryList;
    private List<TeacherListEntity> teacherList;
    private List<AdvertisementListEntity> advertisementList;
    private List<PlatformPromotionCourseListEntity> platformPromotionCourseList;
    private List<HotCatCategoryListEntity> hotCatCategoryList;
    private List<PlatformPromotionPetListEntity> platformPromotionPetList;//特价宠物
    private List<RecommendCourseListEntity> recommendCourseList;


    @Data

    public class PlatformShopListEntity {
        /**
         * shopStar : 3
         * logoImage : https://tabaooss.oss-cn-beijing.aliyuncs.com/shop-logo.png
         * cityName : 武汉市
         * shopName : 22号店铺
         * shopId : 19
         * sellerType : 3
         */
        private int shopStar;
        private String logoImage;
        private String cityName;
        private String shopName;
        private String shopId;
        private int sellerType;



    }
    @Data

    public class HotDogCategoryListEntity {
        /**
         * image : https://tabaooss.oss-cn-beijing.aliyuncs.com/190628990030665.png
         * sorted : 1
         * commodityCategoryName : 柴犬
         * commodityCategoryId : 1356
         * commodityCategoryKey : 1001-1016-1019-1356-
         */
        private String image;
        private int sorted;
        private String commodityCategoryName;
        private String commodityCategoryId;
        private String commodityCategoryKey;


    }
    @Data
    public class TeacherListEntity {
        /**
         * teacherId : 2
         * attachments : [{"subCategory":"1","fileUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190528990020223.png","attachmentId":"181","category":"teacher","referenceId":"2"},{"subCategory":"1","fileUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190621990000144.jpg","attachmentId":"182","category":"teacher","referenceId":"2"},{"subCategory":"1","fileUrl":"https://tabaooss.oss-cn-beijing.aliyuncs.com/190621990000235.jpg","attachmentId":"183","category":"teacher","referenceId":"2"}]
         * teacherName : 张三
         * courseQty : 0
         * addOn : 1559028552
         * teacherTel : 18814121274
         * coverImage : https://tabaooss.oss-cn-beijing.aliyuncs.com/190528990040563.jpg
         * description : 测试讲师测试讲师
         * teacherTitle : 高级宠物训导师
         */
        private String teacherId;
        private List<AttachmentsEntity> attachments;
        private String teacherName;
        private int courseQty;
        private String addOn;
        private String headUrl;
        private String teacherTel;
        private String coverImage;
        private String description;
        private String teacherTitle;

        @Data
        public class AttachmentsEntity {
            /**
             * subCategory : 1
             * fileUrl : https://tabaooss.oss-cn-beijing.aliyuncs.com/190528990020223.png
             * attachmentId : 181
             * category : teacher
             * referenceId : 2
             */
            private String subCategory;
            private String fileUrl;
            private String attachmentId;
            private String category;
            private String referenceId;


        }
    }
    @Data

    public class AdvertisementListEntity {
        /**
         * advertisementPosition : 3
         * advertisementId : 20
         * advertisementUrl : https://tabaooss.oss-cn-beijing.aliyuncs.com/190603990020532.png
         */
        private int advertisementPosition;
        private String advertisementId;
        private String advertisementUrl;

        private String linkUrl;

    }
    @Data

    public class PlatformPromotionCourseListEntity {
        /**
         * courseCategoryName : 常见问题
         * courseName : 狗狗过度吠叫怎么办
         * pageViews : 0
         * price : 1500
         * coverImage : https://tabaooss.oss-cn-beijing.aliyuncs.com/190710990012367.png
         * linePrice : 1800
         * description : 如何制止狗狗过度吠叫呢？
         * courseCategoryKey : 2000-2001-2007-
         * videoTimes : 195
         * courseId : 40
         * joinPlatformPromotion : true
         * multi : false
         */
        private String courseCategoryName;
        private String courseName;
        private int pageViews;
        private int price;
        private String coverImage;
        private int linePrice;
        private String description;
        private String courseCategoryKey;
        private int videoTimes;
        private String courseId;
        private boolean joinPlatformPromotion;
        private boolean multi;

        public int getPrice() {
            return   price/100;

        }

        public String getLinePrice() {
            return "" + linePrice/100;
        }

    }
    @Data
    public class HotCatCategoryListEntity {
        /**
         * image : https://tabaooss.oss-cn-beijing.aliyuncs.com/190628990030889.png
         * sorted : 1
         * commodityCategoryName : 英短
         * commodityCategoryId : 1454
         * commodityCategoryKey : 1001-1017-1306-1454-
         */
        private String image;
        private int sorted;
        private String commodityCategoryName;
        private String commodityCategoryId;
        private String commodityCategoryKey;


    }
    @Data

    public class PlatformPromotionPetListEntity {
        /**
         * upTime : 1565935029
         * thumbnail : https://tabaooss.oss-cn-beijing.aliyuncs.com/android-app.png
         * cityName : 西安市
         * cityCode : 610100
         * price : 100
         * linePrice : 15000
         * commodityId : 40
         * commodityCategoryName : 贵宾
         * newCommodity : false
         * joinPlatformPromotion : true
         * commodityCategoryKey : 1001-1016-1018-1315-
         * actualSales : 6
         */
        private String upTime;
        private String thumbnail;
        private String cityName;
        private String cityCode;
        private String price;
        private String linePrice;
        private String commodityId;
        private int stockCount;
        private String commodityCategoryName;
        private boolean newCommodity;
        private boolean joinPlatformPromotion;
        private String commodityCategoryKey;
        private int actualSales;

        public String getPrice() {
            return "￥" + price.substring(0, price.length() - 2);

        }

        public String getLinePrice() {
            return "￥" + linePrice.substring(0, linePrice.length() -2 );
        }

    }
    @Data

    public class RecommendCourseListEntity {
        /**
         * courseCategoryName : 常见问题
         * courseName : 狗狗过度吠叫怎么办
         * pageViews : 0
         * price : 1500
         * coverImage : https://tabaooss.oss-cn-beijing.aliyuncs.com/190710990012367.png
         * linePrice : 1800
         * description : 如何制止狗狗过度吠叫呢？
         * courseCategoryKey : 2000-2001-2007-
         * videoTimes : 195
         * courseId : 40
         * joinPlatformPromotion : true
         * multi : false
         */
        private String courseCategoryName;
        private String courseName;
        private int pageViews;
        private String price;
        private String coverImage;
        private String linePrice;
        private String description;
        private String courseCategoryKey;
        private int videoTimes;
        private String courseId;
        private boolean joinPlatformPromotion;
        private boolean multi;
        public String getPrice() {
            return "￥" + price.substring(0, price.length() - 2);

        }

        public String getLinePrice() {
            return "" + linePrice.substring(0, linePrice.length() -2 );
        }

    }
}
