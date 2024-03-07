package com.wxw.spzx.feign.cart;

import com.wxw.spzx.model.entity.h5.CartInfo;
import com.wxw.spzx.model.vo.common.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * ClassName: CartFeignClient
 * Package: com.wxw.spzx.feign.cart
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/13 11:25
 * @Version 1.0
 */
@FeignClient(value = "service-cart")
public interface CartFeignClient {

    @GetMapping(value = "/api/order/cart/auth/getAllCkecked")
    List<CartInfo> getAllCkecked();

    @GetMapping(value = "/api/order/cart/auth/deleteChecked")
    Result deleteChecked() ;
}
