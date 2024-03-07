package com.wxw.spzx.user;

import com.wxw.spzx.common.anno.EnableUserWebMvcConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * ClassName: UserApplication
 * Package: com.wxw.spzx.user
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/12 12:03
 * @Version 1.0
 */
@SpringBootApplication
@EnableUserWebMvcConfiguration
@ComponentScan(basePackages = {"com.wxw.spzx"})
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

}
