package com.wxw.spzx.cart;

import com.wxw.spzx.common.anno.EnableUserWebMvcConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ClassName: CartApplication
 * Package: com.wxw.spzx.cart
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/12 13:48
 * @Version 1.0
 */

@EnableFeignClients(basePackages = {"com.wxw.spzx"})
@EnableUserWebMvcConfiguration
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)  // 排除数据库的自动化配置，Cart微服务不需要访问数据库
public class CartApplication {

    public static void main(String[] args) {
        SpringApplication.run(CartApplication.class , args) ;
    }

}
