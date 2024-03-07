package com.wxw.spzx.user.mapper;

import com.wxw.spzx.model.entity.user.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: UserInfoMapper
 * Package: com.wxw.spzx.user.mapper
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/12 12:50
 * @Version 1.0
 */
@Mapper
public interface UserInfoMapper {

    void save(UserInfo userInfo);

    UserInfo getByUsername(String username);

}