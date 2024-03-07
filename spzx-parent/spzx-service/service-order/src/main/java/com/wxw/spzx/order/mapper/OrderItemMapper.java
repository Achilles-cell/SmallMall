package com.wxw.spzx.order.mapper;

import com.wxw.spzx.model.entity.order.OrderItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: OrderItemMapper
 * Package: com.wxw.spzx.order.mapper
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/13 12:17
 * @Version 1.0
 */
@Mapper
public interface OrderItemMapper {
    void save(OrderItem orderItem);

    List<OrderItem> findByOrderId(Long id);
}
