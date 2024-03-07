package com.wxw.spzx.manager.mapper;

import com.wxw.spzx.model.entity.order.OrderStatistics;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: OrderInfoMapper
 * Package: com.wxw.spzx.manager.mapper
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/8 14:05
 * @Version 1.0
 */
@Mapper
public interface OrderInfoMapper {

    // 查询指定日期产生的订单数据
    OrderStatistics selectOrderStatistics(String creatTime);

}