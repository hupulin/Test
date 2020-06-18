package com.xmkj.applibrary.domain.pet;

import java.util.List;

import lombok.Data;

@Data
public class ShopDetailTo {

    /**
     * result : {"ownerPhoneNumber":null,"shopStar":3,"addTime":1565939559,"cityCode":"420100","groupId":24,"shopName":"24号店铺","praiseNum":0,"ownerId":33,"openingBank":"ICBC","monthSales":0,"sellerId":24,"contact":null,"contactNumber":"15333333324","shopId":21,"state":1,"briefIntro":"　　一间芝麻大的小铺 八仙过海各抒己见\n\n　　两三个月煞费苦心 小九九咱向来不精\n\n　　三番四次精心修整 十分诚意还要加二\n\n　　五月终可开张经营 百分热情双倍才行\n\n　　六七淘友常常相聚 千挑万选献上宝贝\n\n　　七嘴八舌谈生意经 亲们满意才是双赢","actualSales":0,"bankNumber":"543566393196527","address":"当代梦工厂807","provinceCode":"420000","owerName":null,"favoriteNum":null,"tags":[{"downTime":null,"upTime":1565430143,"addTime":1565430120,"shopTagId":2,"tagText":"30天健康","state":1},{"downTime":null,"upTime":1565430209,"addTime":1565430185,"shopTagId":4,"tagText":"实地考察","state":1}],"commentNum":0,"areaCode":"420102","logoImage":"https://tabaooss.oss-cn-beijing.aliyuncs.com/shop-logo.png","couponList":[{"couponName":"新人券1号","useStartTime":1567008000,"commodityId":null,"couponId":60,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1569686399,"couponAmount":10,"hadReceived":false,"commodityScope":2,"limitOrderAmount":200,"commodityName":null},{"couponName":"新人券2号","useStartTime":1566294782,"commodityId":null,"couponId":61,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1568973182,"couponAmount":100,"hadReceived":false,"commodityScope":2,"limitOrderAmount":299,"commodityName":null},{"couponName":"新人券3号","useStartTime":1566294782,"commodityId":null,"couponId":62,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1568973182,"couponAmount":200,"hadReceived":false,"commodityScope":2,"limitOrderAmount":599,"commodityName":null},{"couponName":"中秋特惠1号","useStartTime":1567008000,"commodityId":null,"couponId":162,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1569686399,"couponAmount":10,"hadReceived":false,"commodityScope":2,"limitOrderAmount":200,"commodityName":null},{"couponName":"中秋特惠2号","useStartTime":1566807093,"commodityId":null,"couponId":163,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1569485493,"couponAmount":100,"hadReceived":false,"commodityScope":2,"limitOrderAmount":299,"commodityName":null},{"couponName":"中秋特惠3号","useStartTime":1566807093,"commodityId":null,"couponId":164,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1569485493,"couponAmount":200,"hadReceived":false,"commodityScope":2,"limitOrderAmount":599,"commodityName":null},{"couponName":"满200减10","useStartTime":1567008000,"commodityId":null,"couponId":264,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1569686399,"couponAmount":10,"hadReceived":false,"commodityScope":2,"limitOrderAmount":200,"commodityName":null},{"couponName":"满299减100","useStartTime":1566807131,"commodityId":null,"couponId":265,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1569485531,"couponAmount":100,"hadReceived":false,"commodityScope":2,"limitOrderAmount":299,"commodityName":null},{"couponName":"满500减200","useStartTime":1566807131,"commodityId":null,"couponId":266,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1569485531,"couponAmount":200,"hadReceived":false,"commodityScope":2,"limitOrderAmount":599,"commodityName":null},{"couponName":"24号店铺满200减10","useStartTime":1567008000,"commodityId":null,"couponId":369,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1569686399,"couponAmount":1000,"hadReceived":false,"commodityScope":2,"limitOrderAmount":20000,"commodityName":null},{"couponName":"24号店铺满299减100","useStartTime":1566870515,"commodityId":null,"couponId":370,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1569548915,"couponAmount":10000,"typrderAmount":59900,"hadReceived":false,"commodityScope":2,"limitOrderAmount":29900,"commodityName":null},{"couponName":"24号店铺满200减10","useStartTime":1567008000,"commodityId":null,"couponId":483,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1569686399,"couponAmount":1000,"hadReceived":false,"commodityScope":2,"limitOrderAmount":20000,"commodityName":null},{"couponName":"24号店铺满299减100","useStartTime":1566991920,"commodityId":null,"couponId":484,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1569670320,"couponAmount":10000,"hadReceived":false,"commodityScope":2,"limitOrderAmount":29900,"commodityName":null},{"couponName":"24号店铺满500减200","useStartTime":1566991920,"commodityId":null,"couponId":485,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1569670320,"couponAmount":20000,"hadReceived":false,"commodityScope":2,"limitOrderAmount":59900,"commodityName":null}],"sellerType":3}
     */
    private ResultEntity result;

    @Data

    public class ResultEntity {
        /**
         * ownerPhoneNumber : null
         * shopStar : 3
         * addTime : 1565939559
         * cityCode : 420100
         * groupId : 24
         * shopName : 24号店铺
         * praiseNum : 0
         * ownerId : 33
         * openingBank : ICBC
         * monthSales : 0
         * sellerId : 24
         * contact : null
         * contactNumber : 15333333324
         * shopId : 21
         * state : 1
         * briefIntro : 　　一间芝麻大的小铺 八仙过海各抒己见
         * <p>
         * 　　两三个月煞费苦心 小九九咱向来不精
         * <p>
         * 　　三番四次精心修整 十分诚意还要加二
         * <p>
         * 　　五月终可开张经营 百分热情双倍才行
         * <p>
         * 　　六七淘友常常相聚 千挑万选献上宝贝
         * <p>
         * 　　七嘴八舌谈生意经 亲们满意才是双赢
         * actualSales : 0
         * bankNumber : 543566393196527
         * address : 当代梦工厂807
         * provinceCode : 420000
         * owerName : null
         * favoriteNum : null
         * tags : [{"downTime":null,"upTime":1565430143,"addTime":1565430120,"shopTagId":2,"tagText":"30天健康","state":1},{"downTime":null,"upTime":1565430209,"addTime":1565430185,"shopTagId":4,"tagText":"实地考察","state":1}]
         * commentNum : 0
         * areaCode : 420102
         * logoImage : https://tabaooss.oss-cn-beijing.aliyuncs.com/shop-logo.png
         * couponList : [{"couponName":"新人券1号","useStartTime":1567008000,"commodityId":null,"couponId":60,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1569686399,"couponAmount":10,"hadReceived":false,"commodityScope":2,"limitOrderAmount":200,"commodityName":null},{"couponName":"新人券2号","useStartTime":1566294782,"commodityId":null,"couponId":61,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1568973182,"couponAmount":100,"hadReceived":false,"commodityScope":2,"limitOrderAmount":299,"commodityName":null},{"couponName":"新人券3号","useStartTime":1566294782,"commodityId":null,"couponId":62,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1568973182,"couponAmount":200,"hadReceived":false,"commodityScope":2,"limitOrderAmount":599,"commodityName":null},{"couponName":"中秋特惠1号","useStartTime":1567008000,"commodityId":null,"couponId":162,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1569686399,"couponAmount":10,"hadReceived":false,"commodityScope":2,"limitOrderAmount":200,"commodityName":null},{"couponName":"中秋特惠2号","useStartTime":1566807093,"commodityId":null,"couponId":163,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1569485493,"couponAmount":100,"hadReceived":false,"commodityScope":2,"limitOrderAmount":299,"commodityName":null},{"couponName":"中秋特惠3号","useStartTime":1566807093,"commodityId":null,"couponId":164,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1569485493,"couponAmount":200,"hadReceived":false,"commodityScope":2,"limitOrderAmount":599,"commodityName":null},{"couponName":"满200减10","useStartTime":1567008000,"commodityId":null,"couponId":264,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1569686399,"couponAmount":10,"hadReceived":false,"commodityScope":2,"limitOrderAmount":200,"commodityName":null},{"couponName":"满299减100","useStartTime":1566807131,"commodityId":null,"couponId":265,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1569485531,"couponAmount":100,"hadReceived":false,"commodityScope":2,"limitOrderAmount":299,"commodityName":null},{"couponName":"满500减200","useStartTime":1566807131,"commodityId":null,"couponId":266,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1569485531,"couponAmount":200,"hadReceived":false,"commodityScope":2,"limitOrderAmount":599,"commodityName":null},{"couponName":"24号店铺满200减10","useStartTime":1567008000,"commodityId":null,"couponId":369,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1569686399,"couponAmount":1000,"hadReceived":false,"commodityScope":2,"limitOrderAmount":20000,"commodityName":null},{"couponName":"24号店铺满299减100","useStartTime":1566870515,"commodityId":null,"couponId":370,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1569548915,"couponAmount":10000,"typrderAmount":59900,"hadReceived":false,"commodityScope":2,"limitOrderAmount":29900,"commodityName":null},{"couponName":"24号店铺满200减10","useStartTime":1567008000,"commodityId":null,"couponId":483,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1569686399,"couponAmount":1000,"hadReceived":false,"commodityScope":2,"limitOrderAmount":20000,"commodityName":null},{"couponName":"24号店铺满299减100","useStartTime":1566991920,"commodityId":null,"couponId":484,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1569670320,"couponAmount":10000,"hadReceived":false,"commodityScope":2,"limitOrderAmount":29900,"commodityName":null},{"couponName":"24号店铺满500减200","useStartTime":1566991920,"commodityId":null,"couponId":485,"type":1,"commodityCategoryName":null,"commodityCategoryKey":null,"useEndTime":1569670320,"couponAmount":20000,"hadReceived":false,"commodityScope":2,"limitOrderAmount":59900,"commodityName":null}]
         * sellerType : 3
         */
        private String ownerPhoneNumber;
        private int shopStar;
        private boolean selfShop;
        private int addTime;
        private String cityCode;
        private int groupId;
        private String shopName;
        private int praiseNum;
        private int ownerId;
        private int fansNum;
        private String openingBank;
        private int monthSales;
        private boolean favorite;
        private int sellerId;
        private String contact;
        private String contactNumber;
        private int shopId;
        private int state;
        private String briefIntro;
        private int actualSales;
        private String bankNumber;
        private String address;
        private String provinceCode;
        private String owerName;
        private String mergerName;
        private int favoriteNum;
        private List<TagsEntity> tags;
        private int commentNum;
        private String areaCode;
        private String logoImage;
        private List<CouponListEntity> couponList;
        private int sellerType;

        @Data

        public class TagsEntity {
            /**
             * downTime : null
             * upTime : 1565430143
             * addTime : 1565430120
             * shopTagId : 2
             * tagText : 30天健康
             * state : 1
             */
            private String downTime;
            private int upTime;
            private int addTime;
            private int shopTagId;
            private String tagText;
            private int state;

        }

        @Data
        public class CouponListEntity {
            /**
             * couponName : 新人券1号
             * useStartTime : 1567008000
             * commodityId : null
             * couponId : 60
             * type : 1
             * commodityCategoryName : null
             * commodityCategoryKey : null
             * useEndTime : 1569686399
             * couponAmount : 10
             * hadReceived : false
             * commodityScope : 2
             * limitOrderAmount : 200
             * commodityName : null
             */
            private String couponName;
            private long useStartTime;
            private String commodityId;
            private int couponId;
            private int type;
            private String commodityCategoryName;
            private String commodityCategoryKey;
            private long useEndTime;



            private int couponAmount;
            private boolean hadReceived;
            private int commodityScope;
            private int limitOrderAmount;




            private String commodityName;

        }
    }
}
