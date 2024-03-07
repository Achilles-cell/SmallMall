package com.wxw.spzx.order.mapper;

import com.wxw.spzx.model.entity.order.OrderInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: OrderInfoMapper
 * Package: com.wxw.spzx.order.mapper
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/13 12:17
 * @Version 1.0
 */
@Mapper
public interface OrderInfoMapper {
    void save(OrderInfo orderInfo);

    OrderInfo getById(Long orderId);

    List<OrderInfo> findUserPage(Long userId, Integer orderStatus);

    OrderInfo getByOrderNo(String orderNo) ;

    void updateById(OrderInfo orderInfo);
}
