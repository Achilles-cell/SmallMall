package com.wxw.spzx.manager.service.Impl;

import com.wxw.spzx.common.log.service.AsyncOperLogService;
import com.wxw.spzx.manager.mapper.SysOperLogMapper;
import com.wxw.spzx.model.entity.system.SysOperLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * ClassName: AsyncOperLogServiceImpl
 * Package: com.wxw.spzx.manager.service.Impl
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/9 15:30
 * @Version 1.0
 */
@Service
public class AsyncOperLogServiceImpl implements AsyncOperLogService {

    @Autowired
    private SysOperLogMapper sysOperLogMapper;

    @Async      // 异步执行保存日志操作
    @Override
    public void saveSysOperLog(SysOperLog sysOperLog) {
        sysOperLogMapper.insert(sysOperLog);
    }

}
