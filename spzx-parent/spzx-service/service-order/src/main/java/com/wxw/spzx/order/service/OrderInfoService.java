package com.wxw.spzx.order.service;

import com.github.pagehelper.PageInfo;
import com.wxw.spzx.model.dto.h5.OrderInfoDto;
import com.wxw.spzx.model.entity.order.OrderInfo;
import com.wxw.spzx.model.vo.h5.TradeVo;

/**
 * ClassName: OrderInfoService
 * Package: com.wxw.spzx.order.service
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/13 11:32
 * @Version 1.0
 */
public interface OrderInfoService {
    TradeVo getTrade();

    Long submitOrder(OrderInfoDto orderInfoDto);

    OrderInfo getOrderInfo(Long orderId);

    TradeVo buy(Long skuId);

    PageInfo<OrderInfo> findUserPage(Integer page, Integer limit, Integer orderStatus);

    OrderInfo getByOrderNo(String orderNo);

    void updateOrderStatus(String orderNo, Integer orderStatus);
}
