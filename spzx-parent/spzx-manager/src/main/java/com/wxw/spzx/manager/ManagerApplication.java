package com.wxw.spzx.manager;

import com.wxw.spzx.common.log.annotation.EnableLogAspect;
import com.wxw.spzx.manager.properties.MinioProperties;
import com.wxw.spzx.manager.properties.UserAuthProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * ClassName: ManagerApplication
 * Package: com.wxw.spzx.manager
 * Description:
 *
 * @Author 风雅颂
 * @Create 2023/12/18 14:18
 * @Version 1.0
 */


/**
 * DTO:前端给后端传递的数据
 * VO:后端给前端传递的数据
 * DO:数据库表结构
 * PO:数据库表结构到JAVA的映射类 一般我们使用Mybatis建的类为PO,
 * 控制器接受到前端发来的参数为DTO,给前端发送的安全的数据为VO
 */

@EnableAsync
@SpringBootApplication
@EnableScheduling
@EnableLogAspect
@ComponentScan(basePackages = {"com.wxw.spzx"})
@EnableConfigurationProperties(value = {UserAuthProperties.class, MinioProperties.class})
public class ManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManagerApplication.class,args);
    }
}
