package com.wxw.spzx.pay.utils;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * ClassName: AlipayProperties
 * Package: com.wxw.spzx.pay.utils
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/13 14:37
 * @Version 1.0
 */
@Data
@ConfigurationProperties(prefix = "spzx.alipay")
public class AlipayProperties {

    private String alipayUrl;
    private String appPrivateKey;
    public  String alipayPublicKey;
    private String appId;
    public  String returnPaymentUrl;
    public  String notifyPaymentUrl;

    public final static String format="json";
    public final static String charset="utf-8";
    public final static String sign_type="RSA2";

}