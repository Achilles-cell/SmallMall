package com.wxw.ssyx.common.auth;

import com.wxw.ssyx.vo.user.UserLoginVo;

/**
 * ClassName: AuthContextHolder
 * Package: com.wxw.ssyx.common.auth
 * Description:
 *
 * @Author 风雅颂
 * @Create 2023/11/23 14:15
 * @Version 1.0
 */
//ThreadLocal工具类
public class AuthContextHolder {

    //用户id
    private static ThreadLocal<Long> userId = new ThreadLocal<>();

    //用户仓库id
    private static ThreadLocal<Long> wareId = new ThreadLocal<>();

    //用户信息对象
    private static ThreadLocal<UserLoginVo> userLoginVo = new ThreadLocal<>();

    //userId操作的方法
    public static void setUserId(Long _userId) {
        userId.set(_userId);
    }

    public static Long getUserId() {
        return userId.get();
    }

    public static Long getWareId(){
        return wareId.get();
    }

    public static void setWareId(Long _wareId){
        wareId.set(_wareId);
    }

    public static UserLoginVo getUserLoginVo() {
        return userLoginVo.get();
    }

    public static void setUserLoginVo(UserLoginVo _userLoginVo) {
        userLoginVo.set(_userLoginVo);
    }


}
