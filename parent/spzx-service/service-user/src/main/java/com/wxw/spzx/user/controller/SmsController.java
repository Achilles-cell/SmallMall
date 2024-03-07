package com.wxw.spzx.user.controller;

import com.wxw.spzx.model.vo.common.Result;
import com.wxw.spzx.model.vo.common.ResultCodeEnum;
import com.wxw.spzx.user.service.SmsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: SmsController
 * Package: com.wxw.spzx.user.controller
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/12 12:04
 * @Version 1.0
 */
@Tag(name = "短信验证码接口")
@RestController
@RequestMapping("api/user/sms")
public class SmsController {

    @Autowired
    private SmsService smsService ;

    @Operation(summary = "发送验证码")
    @GetMapping(value = "/sendCode/{phone}")
    public Result sendValidateCode(@PathVariable String phone) {
        smsService.sendValidateCode(phone);
        return Result.build(null , ResultCodeEnum.SUCCESS) ;
    }

}
