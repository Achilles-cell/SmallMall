package com.wxw.spzx.common.interceptor;

import com.alibaba.fastjson.JSON;
import com.wxw.spzx.model.entity.user.UserInfo;
import com.wxw.spzx.utils.AuthContextUtil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * ClassName: UserLoginAuthInterceptor
 * Package: com.wxw.spzx.common.interceptor
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/12 13:21
 * @Version 1.0
 */
public class UserLoginAuthInterceptor implements HandlerInterceptor {

    @Autowired
    private RedisTemplate<String , String> redisTemplate ;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        // 如果token不为空，那么此时验证token的合法性
        String userInfoJSON = redisTemplate.opsForValue().get("user:spzx:" + request.getHeader("token"));
        AuthContextUtil.setUserInfo(JSON.parseObject(userInfoJSON , UserInfo.class));
        return true ;

    }

}
