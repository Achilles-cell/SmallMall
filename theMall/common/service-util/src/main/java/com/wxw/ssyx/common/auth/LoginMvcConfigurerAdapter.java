package com.wxw.ssyx.common.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import javax.annotation.Resource;

/**
 * ClassName: LoginMvcConfigurerAdapter
 * Package: com.wxw.ssyx.common.auth
 * Description:
 *
 * @Author 风雅颂
 * @Create 2023/11/23 14:16
 * @Version 1.0
 */
@Configuration
public class LoginMvcConfigurerAdapter extends WebMvcConfigurationSupport {

    @Resource
    private RedisTemplate redisTemplate;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new UserLoginInterceptor(redisTemplate))
                .addPathPatterns("/api/**")
                .excludePathPatterns("/api/user/weixin/wxLogin/*");
        super.addInterceptors(registry);
    }
}
