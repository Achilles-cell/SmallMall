package com.wxw.spzx.pay.configuration;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.wxw.spzx.pay.utils.AlipayProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: AlipayConfiguration
 * Package: com.wxw.spzx.pay.configuration
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/13 14:38
 * @Version 1.0
 */
@Configuration
public class AlipayConfiguration {

    @Autowired
    private AlipayProperties alipayProperties ;

    @Bean
    public AlipayClient alipayClient(){
        AlipayClient alipayClient = new DefaultAlipayClient(alipayProperties.getAlipayUrl() ,
                alipayProperties.getAppId() ,
                alipayProperties.getAppPrivateKey() ,
                AlipayProperties.format ,
                AlipayProperties.charset ,
                alipayProperties.getAlipayPublicKey() ,
                AlipayProperties.sign_type );
        return alipayClient;
    }

}
