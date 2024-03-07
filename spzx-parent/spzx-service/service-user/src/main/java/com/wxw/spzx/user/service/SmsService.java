package com.wxw.spzx.user.service;

/**
 * ClassName: SmsService
 * Package: com.wxw.spzx.user.service
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/12 12:05
 * @Version 1.0
 */
public interface SmsService {
    void sendValidateCode(String phone);
}
