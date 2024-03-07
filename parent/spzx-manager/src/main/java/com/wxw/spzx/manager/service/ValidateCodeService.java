package com.wxw.spzx.manager.service;

import com.wxw.spzx.model.vo.system.ValidateCodeVo;

/**
 * ClassName: ValidateCodeService
 * Package: com.wxw.spzx.manager.service
 * Description:
 *
 * @Author 风雅颂
 * @Create 2023/12/19 14:14
 * @Version 1.0
 */
public interface ValidateCodeService {

    // 获取验证码图片
    ValidateCodeVo generateValidateCode();

}
