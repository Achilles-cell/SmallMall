package com.wxw.spzx.user.service.Impl;

import com.wxw.spzx.model.entity.user.UserAddress;
import com.wxw.spzx.user.mapper.UserAddressMapper;
import com.wxw.spzx.user.service.UserAddressService;
import com.wxw.spzx.utils.AuthContextUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: UserAddressServiceImpl
 * Package: com.wxw.spzx.user.service.Impl
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/13 11:21
 * @Version 1.0
 */
@Service
@SuppressWarnings({"unchecked", "rawtypes"})
public class UserAddressServiceImpl implements UserAddressService {

    @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public List<UserAddress> findUserAddressList() {
        Long userId = AuthContextUtil.getUserInfo().getId();
        return userAddressMapper.findByUserId(userId);
    }

    @Override
    public UserAddress getById(Long id) {
        return userAddressMapper.getById(id);
    }
}
