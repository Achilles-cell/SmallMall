package com.wxw.spzx.common.anno;

import com.wxw.spzx.common.interceptor.UserTokenFeignInterceptor;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName: EnableUserTokenFeignInterceptor
 * Package: com.wxw.spzx.common.anno
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/13 11:35
 * @Version 1.0
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
@Import(value = UserTokenFeignInterceptor.class)
public @interface EnableUserTokenFeignInterceptor {

}