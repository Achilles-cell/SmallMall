package com.wxw.spzx.user.mapper;

import com.wxw.spzx.model.entity.user.UserAddress;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: UserAddressMapper
 * Package: com.wxw.spzx.user.mapper
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/13 11:22
 * @Version 1.0
 */
@Mapper
public interface UserAddressMapper {

    List<UserAddress> findByUserId(Long userId);

    UserAddress getById(Long id);
}
