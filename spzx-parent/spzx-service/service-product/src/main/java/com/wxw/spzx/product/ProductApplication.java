package com.wxw.spzx.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * ClassName: ProductApplication
 * Package: com.wxw.spzx.product
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/9 17:26
 * @Version 1.0
 */
@SpringBootApplication
@EnableCaching
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }

}
