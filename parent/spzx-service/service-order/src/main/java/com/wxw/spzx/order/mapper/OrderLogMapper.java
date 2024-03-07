package com.wxw.spzx.order.mapper;

import com.wxw.spzx.model.entity.order.OrderLog;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: OrderLogMapper
 * Package: com.wxw.spzx.order.mapper
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/13 12:17
 * @Version 1.0
 */
@Mapper
public interface OrderLogMapper {
    void save(OrderLog orderLog);
}
