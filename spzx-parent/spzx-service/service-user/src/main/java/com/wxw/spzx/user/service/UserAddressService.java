package com.wxw.spzx.user.service;

import com.wxw.spzx.model.entity.user.UserAddress;

import java.util.List;

/**
 * ClassName: UserAddressService
 * Package: com.wxw.spzx.user.service
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/13 11:21
 * @Version 1.0
 */
public interface UserAddressService {

    List<UserAddress> findUserAddressList();

    UserAddress getById(Long id);
}
