package com.wxw.spzx.common.anno;

import com.wxw.spzx.common.config.UserWebMvcConfiguration;
import com.wxw.spzx.common.interceptor.UserLoginAuthInterceptor;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName: EnableUserWebMvcConfiguration
 * Package: com.wxw.spzx.common.anno
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/12 13:25
 * @Version 1.0
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
@Import(value = { UserLoginAuthInterceptor.class , UserWebMvcConfiguration.class})
public @interface EnableUserWebMvcConfiguration {

}
