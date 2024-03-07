package com.wxw.spzx.feign.user;

import com.wxw.spzx.model.entity.user.UserAddress;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * ClassName: UserFeignClient
 * Package: com.wxw.spzx.feign.user
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/13 12:11
 * @Version 1.0
 */
@FeignClient(value = "service-user")
public interface UserFeignClient {

    @GetMapping("/api/user/userAddress/getUserAddress/{id}")
    UserAddress getUserAddress(@PathVariable Long id) ;

}
