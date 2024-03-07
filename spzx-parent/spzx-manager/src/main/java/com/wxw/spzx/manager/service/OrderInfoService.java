package com.wxw.spzx.manager.service;

import com.wxw.spzx.model.dto.order.OrderStatisticsDto;
import com.wxw.spzx.model.vo.order.OrderStatisticsVo;

/**
 * ClassName: OrderInfoService
 * Package: com.wxw.spzx.manager.service
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/8 14:07
 * @Version 1.0
 */
public interface OrderInfoService {

    OrderStatisticsVo getOrderStatisticsData(OrderStatisticsDto orderStatisticsDto);
}
