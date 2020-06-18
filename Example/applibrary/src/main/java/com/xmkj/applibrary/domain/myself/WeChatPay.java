package com.xmkj.applibrary.domain.myself;

import lombok.Data;

@Data
public class WeChatPay {

    /**
     * appId : wxbf1099a490cb8b9a
     * sign : 44335341F9C443CA329156352D2A3458
     * prepayId : wx200931196088212841ae488c1666762900
     * partnerId : 1518532941
     * nonce : 2df235dd3d384f9e88e5c3c41fbb74d2
     * timestamp : 1568943079
     */
    private String appId;
    private String sign;
    private String prepayId;
    private String partnerId;
    private String nonce;
    private String timestamp;

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getAppId() {
        return appId;
    }

    public String getSign() {
        return sign;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public String getNonce() {
        return nonce;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
