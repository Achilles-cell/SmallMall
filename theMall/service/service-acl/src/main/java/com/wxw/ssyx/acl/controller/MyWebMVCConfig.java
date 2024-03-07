package com.wxw.ssyx.acl.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ClassName: MyWebMVCConfig
 * Package: com.wxw.ssyx.acl.controller
 * Description:
 *
 * @Author 风雅颂
 * @Create 2023/12/5 17:19
 * @Version 1.0
 */
@Configuration
public class MyWebMVCConfig implements WebMvcConfigurer {
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        // 解决静态资源⽆法访问
//        registry.addResourceHandler("/**")
//                .addResourceLocations("classpath:/static/");
//        // 解决swagger⽆法访问
//        registry.addResourceHandler("/swagger-ui.html")
//                .addResourceLocations("classpath:/META-INF/resources/");
//        // 解决swagger的js⽂件⽆法访问
//        registry.addResourceHandler("/webjars/**")
//                .addResourceLocations("classpath:/META-INF/resources/webjars/");
//    }

}
