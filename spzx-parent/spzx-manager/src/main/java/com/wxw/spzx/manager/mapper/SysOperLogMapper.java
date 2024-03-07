package com.wxw.spzx.manager.mapper;

import com.wxw.spzx.model.entity.system.SysOperLog;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: SysOperLogMapper
 * Package: com.wxw.spzx.manager.mapper
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/9 15:26
 * @Version 1.0
 */
@Mapper
public interface SysOperLogMapper {
    void insert(SysOperLog sysOperLog);
}
