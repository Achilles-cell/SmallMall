package com.wxw.spzx.pay;

import com.wxw.spzx.common.anno.EnableUserWebMvcConfiguration;
import com.wxw.spzx.pay.utils.AlipayProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ClassName: PayApplication
 * Package: com.wxw.spzx.pay
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/13 14:28
 * @Version 1.0
 */
@EnableConfigurationProperties(value = { AlipayProperties.class })
@EnableFeignClients(basePackages = {
        "com.wxw.spzx"
})
@SpringBootApplication
//存在问题
//@EnableUserWebMvcConfiguration
public class PayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayApplication.class , args) ;
    }

}
