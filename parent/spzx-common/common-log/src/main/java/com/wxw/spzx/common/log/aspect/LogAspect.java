package com.wxw.spzx.common.log.aspect;

import com.wxw.spzx.common.log.annotation.Log;
import com.wxw.spzx.common.log.service.AsyncOperLogService;
import com.wxw.spzx.common.log.utils.LogUtil;
import com.wxw.spzx.model.entity.system.SysOperLog;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ClassName: LogAspect
 * Package: com.wxw.spzx.common.log.aspect
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/9 15:08
 * @Version 1.0
 */
@Aspect
@Component
@Slf4j
public class LogAspect {            // 环绕通知切面类定义

    @Autowired
    private AsyncOperLogService asyncOperLogService ;

    @Around(value = "@annotation(sysLog)")
    public Object doAroundAdvice(ProceedingJoinPoint joinPoint , Log sysLog) {

        // 构建前置参数
        SysOperLog sysOperLog = new SysOperLog() ;

        LogUtil.beforeHandleLog(sysLog , joinPoint , sysOperLog) ;

        Object proceed = null;
        try {
            proceed = joinPoint.proceed();
            // 执行业务方法
            LogUtil.afterHandlLog(sysLog , proceed , sysOperLog , 0 , null) ;
            // 构建响应结果参数
        } catch (Throwable e) {                                 // 代码执行进入到catch中，
            // 业务方法执行产生异常
            e.printStackTrace();                                // 打印异常信息
            LogUtil.afterHandlLog(sysLog , proceed , sysOperLog , 1 , e.getMessage()) ;
            throw new RuntimeException(); //需要手动抛出异常，以为事务注解操作存在默认的切片类，且优先级较高，不跑出异常事务感知不到错误
            // 切片类后相当于事务操作在此函数处加入新的切片操作，没有抛出异常，那么外侧新加入的切片语句检测不到异常
            // 因为最内部产生的异常操作被log切片处理了，不接着抛出的话，更外侧的事务切片类会感知不到错误
        }

        // 保存日志数据
        asyncOperLogService.saveSysOperLog(sysOperLog);

        // 返回执行结果
        return proceed ;
    }
}
