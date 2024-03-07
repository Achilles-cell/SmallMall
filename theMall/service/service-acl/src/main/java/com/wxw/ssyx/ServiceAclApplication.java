package com.wxw.ssyx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * ClassName: ServiceAclApplication
 * Package: com.wxw.ssyx
 * Description:
 *
 * @Author 风雅颂
 * @Create 2023/11/27 19:57
 * @Version 1.0
 */
//权限管理模块启动类
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceAclApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAclApplication.class, args);
    }

}
