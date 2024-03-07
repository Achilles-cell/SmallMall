package com.wxw.spzx.manager.mapper;

import com.wxw.spzx.model.dto.order.OrderStatisticsDto;
import com.wxw.spzx.model.entity.order.OrderStatistics;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: OrderStatisticsMapper
 * Package: com.wxw.spzx.manager.mapper
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/8 14:06
 * @Version 1.0
 */
@Mapper
public interface OrderStatisticsMapper {

    void insert(OrderStatistics orderStatistics);

    List<OrderStatistics> selectList(OrderStatisticsDto orderStatisticsDto);
}
