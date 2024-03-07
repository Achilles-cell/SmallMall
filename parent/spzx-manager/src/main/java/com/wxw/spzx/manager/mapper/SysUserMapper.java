package com.wxw.spzx.manager.mapper;

import com.wxw.spzx.model.dto.system.SysUserDto;
import com.wxw.spzx.model.entity.system.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: SysUserMapper
 * Package: com.wxw.spzx.manager.mapper
 * Description:
 *
 * @Author 风雅颂
 * @Create 2023/12/18 14:23
 * @Version 1.0
 */
@Mapper
public interface SysUserMapper {

    /**
     * 根据用户名查询用户数据
     * @param userName
     * @return
     */
    SysUser selectByUserName(String userName) ;

    List<SysUser> findByPage(SysUserDto sysUserDto);

    void saveSysUser(SysUser sysUser);

    void updateSysUser(SysUser sysUser);

    void deleteById(Long userId);
}
