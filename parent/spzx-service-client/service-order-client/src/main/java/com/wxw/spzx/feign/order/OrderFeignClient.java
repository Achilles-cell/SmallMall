package com.wxw.spzx.feign.order;

import com.wxw.spzx.model.entity.order.OrderInfo;
import com.wxw.spzx.model.vo.common.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * ClassName: OrderFeignClient
 * Package: com.wxw.spzx.feign.order
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/13 14:30
 * @Version 1.0
 */
@FeignClient(value = "service-order")
public interface OrderFeignClient {

    @GetMapping("/api/order/orderInfo/auth/getOrderInfoByOrderNo/{orderNo}")
    Result<OrderInfo> getOrderInfoByOrderNo(@PathVariable String orderNo) ;

    @GetMapping("/api/order/orderInfo/auth/updateOrderStatusPayed/{orderNo}/{orderStatus}")
    Result updateOrderStatus(@PathVariable(value = "orderNo") String orderNo, @PathVariable(value = "orderStatus") Integer orderStatus) ;
}
