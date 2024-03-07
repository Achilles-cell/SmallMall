package com.wxw.spzx.cart.service;

import com.wxw.spzx.model.entity.h5.CartInfo;

import java.util.List;

/**
 * ClassName: CartService
 * Package: com.wxw.spzx.cart.service
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/12 14:01
 * @Version 1.0
 */
public interface CartService {

    void addToCart(Long skuId, Integer skuNum);

    List<CartInfo> getCartList();

    void deleteCart(Long skuId);

    void checkCart(Long skuId, Integer isChecked);

    void allCheckCart(Integer isChecked);

    void clearCart();

    List<CartInfo> getAllCkecked();

    void deleteChecked();
}
