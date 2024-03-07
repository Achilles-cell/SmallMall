package com.wxw.ssyx.common.exception;

import com.wxw.ssyx.common.result.Result;
import com.wxw.ssyx.common.result.ResultCodeEnum;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: GlobalExceptionHandler
 * Package: com.wxw.ssyx.common.exception
 * Description:
 *
 * @Author 风雅颂
 * @Create 2023/11/23 14:03
 * @Version 1.0
 */
//AOP 面向切面
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class) //异常处理器
    @ResponseBody  //返回json数据
    public Result error(Exception e) {
        e.printStackTrace();
        return Result.fail(null);
    }

    //自定义异常处理
    @ExceptionHandler(SsyxException.class)
    @ResponseBody
    public Result error(SsyxException exception) {

        return Result.build(null,exception.getCode(),exception.getMessage());
    }
}
