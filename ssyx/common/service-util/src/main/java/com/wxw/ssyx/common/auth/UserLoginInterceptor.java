package com.wxw.ssyx.common.auth;

import com.wxw.ssyx.common.constant.RedisConst;
import com.wxw.ssyx.common.utils.JwtHelper;
import com.wxw.ssyx.vo.user.UserLoginVo;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ClassName: UserLoginInterceptor
 * Package: com.wxw.ssyx.common.auth
 * Description:
 *
 * @Author 风雅颂
 * @Create 2023/11/23 14:17
 * @Version 1.0
 */
public class UserLoginInterceptor implements HandlerInterceptor {

    private RedisTemplate redisTemplate;
    public UserLoginInterceptor(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        this.getUserLoginVo(request);
        return true;
    }

    private void getUserLoginVo(HttpServletRequest request) {
        //从请求头获取token
        String token = request.getHeader("token");

        //判断token不为空
        if(!StringUtils.isEmpty(token)) {
            //从token获取userId
            Long userId = JwtHelper.getUserId(token);
            //根据userId到Redis获取用户信息
            UserLoginVo userLoginVo = (UserLoginVo)redisTemplate.opsForValue()
                    .get(RedisConst.USER_LOGIN_KEY_PREFIX + userId);
            //获取数据放到ThreadLocal里面
            if(userLoginVo != null) {
                AuthContextHolder.setUserId(userLoginVo.getUserId());
                AuthContextHolder.setWareId(userLoginVo.getWareId());
                AuthContextHolder.setUserLoginVo(userLoginVo);
            }
        }
    }
}
