package com.wxw.spzx.user.service;

import com.wxw.spzx.model.dto.h5.UserLoginDto;
import com.wxw.spzx.model.dto.h5.UserRegisterDto;
import com.wxw.spzx.model.vo.h5.UserInfoVo;

/**
 * ClassName: UserInfoService
 * Package: com.wxw.spzx.user.service
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/12 12:45
 * @Version 1.0
 */
public interface UserInfoService {
    void register(UserRegisterDto userRegisterDto);

    Object login(UserLoginDto userLoginDto);

    UserInfoVo getCurrentUserInfo(String token);
}
