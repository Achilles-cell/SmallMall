package com.wxw.spzx.order;

import com.wxw.spzx.common.anno.EnableUserTokenFeignInterceptor;
import com.wxw.spzx.common.anno.EnableUserWebMvcConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ClassName: OrderApplication
 * Package: com.wxw.spzx.order
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/13 11:31
 * @Version 1.0
 */
@SpringBootApplication
@EnableFeignClients(basePackages = {
        "com.wxw.spzx.feign.cart",
        "com.wxw.spzx.feign.user",
        "com.wxw.spzx.feign.product"
})
@EnableUserTokenFeignInterceptor
@EnableUserWebMvcConfiguration
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class , args) ;
    }

}
