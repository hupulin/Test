package com.xmkj.applibrary.domain.myself;

import lombok.Data;

@Data
public class AccountTo {

    /**
     * result : {"accountId":2,"alipayAccountFullname":"6357689090@qq.com","amount":0,"accountSubjectName":"18310885332","addOn":1564131546,"accountSubjectId":525,"accountSubjectType":2,"alipayAccountId":2,"version":1,"alipayAccountName":"胡普林"}
     */
    private ResultEntity result;

    @Data

    public class ResultEntity {
        /**
         * accountId : 2
         * alipayAccountFullname : 6357689090@qq.com
         * amount : 0
         * accountSubjectName : 18310885332
         * addOn : 1564131546
         * accountSubjectId : 525
         * accountSubjectType : 2
         * alipayAccountId : 2
         * version : 1
         * alipayAccountName : 胡普林
         */
        private int accountId;
        private String alipayAccountFullname;
        private int amount;
        private String accountSubjectName;
        private int addOn;
        private int accountSubjectId;
        private int accountSubjectType;
        private int alipayAccountId;
        private int version;
        private String alipayAccountName;

    }
}
