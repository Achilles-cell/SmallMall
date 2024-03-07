package com.wxw.spzx.pay.service;

import com.wxw.spzx.model.entity.pay.PaymentInfo;

import java.util.Map;

/**
 * ClassName: PaymentInfoService
 * Package: com.wxw.spzx.pay.service
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/13 14:33
 * @Version 1.0
 */
public interface PaymentInfoService {

    PaymentInfo savePaymentInfo(String orderNo);

    void updatePaymentStatus(Map<String, String> map, Integer payType);
}
