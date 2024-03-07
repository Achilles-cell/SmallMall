package com.wxw.spzx.common.log.service;

import com.wxw.spzx.model.entity.system.SysOperLog;

/**
 * ClassName: AsyncOperLogService
 * Package: com.wxw.spzx.common.log.service
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/9 15:25
 * @Version 1.0
 */
public interface AsyncOperLogService {			// 保存日志数据
    void saveSysOperLog(SysOperLog sysOperLog) ;
}
