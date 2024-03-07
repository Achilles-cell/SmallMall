package com.wxw.spzx.manager.utils;

import cn.hutool.core.date.DateUtil;
import com.wxw.spzx.manager.mapper.OrderInfoMapper;
import com.wxw.spzx.manager.mapper.OrderStatisticsMapper;
import com.wxw.spzx.model.entity.order.OrderStatistics;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: OrderStatisticsTask
 * Package: com.wxw.spzx.manager.utils
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/8 14:04
 * @Version 1.0
 */
@Component
@Slf4j
public class OrderStatisticsTask {

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Autowired
    private OrderStatisticsMapper orderStatisticsMapper;

    @Scheduled(cron = "0 0 2 * * ?")
    public void orderTotalAmountStatistics() {
        String createTime = DateUtil.offsetDay(new Date(), -1).toString(new SimpleDateFormat("yyyy-MM-dd"));
        OrderStatistics orderStatistics = orderInfoMapper.selectOrderStatistics(createTime);
        if(orderStatistics != null) {
            orderStatisticsMapper.insert(orderStatistics) ;
        }
    }

}
