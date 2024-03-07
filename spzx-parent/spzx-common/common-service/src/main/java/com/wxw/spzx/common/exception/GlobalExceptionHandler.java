package com.wxw.spzx.common.exception;

/**
 * ClassName: GlobalExceptionHandler
 * Package: com.wxw.spzx.common.exception
 * Description:
 *
 * @Author 风雅颂
 * @Create 2023/12/18 15:13
 * @Version 1.0
 */

import com.wxw.spzx.model.vo.common.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理类
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();
        return Result.build(null , 201,"出现了异常") ;
    }

    @ExceptionHandler(value = GuiguException.class)     // 处理自定义异常
    @ResponseBody
    public Result error(GuiguException exception) {
        exception.printStackTrace();
        return Result.build(null , exception.getResultCodeEnum()) ;
    }
}
