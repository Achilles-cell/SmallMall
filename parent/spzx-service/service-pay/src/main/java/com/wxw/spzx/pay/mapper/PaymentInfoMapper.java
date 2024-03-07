package com.wxw.spzx.pay.mapper;

import com.wxw.spzx.model.entity.pay.PaymentInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: PaymentInfoMapper
 * Package: com.wxw.spzx.pay.mapper
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/13 14:34
 * @Version 1.0
 */
@Mapper
public interface PaymentInfoMapper {
    void save(PaymentInfo paymentInfo);
    PaymentInfo getByOrderNo(String orderNo);

    void updateById(PaymentInfo paymentInfo);
}
