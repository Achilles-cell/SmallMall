package com.wxw.spzx.manager.service;

import com.github.pagehelper.PageInfo;
import com.wxw.spzx.model.dto.system.AssignRoleDto;
import com.wxw.spzx.model.dto.system.LoginDto;
import com.wxw.spzx.model.dto.system.SysUserDto;
import com.wxw.spzx.model.entity.system.SysUser;
import com.wxw.spzx.model.vo.system.LoginVo;

/**
 * ClassName: SysUserService
 * Package: com.wxw.spzx.manager.service
 * Description:
 *
 * @Author 风雅颂
 * @Create 2023/12/18 14:22
 * @Version 1.0
 */
public interface SysUserService {

    /**
     * 根据用户名查询用户数据
     * @return
     */
    LoginVo login(LoginDto loginDto) ;

    SysUser getUserInfo(String token);

    void logout(String token);

    PageInfo<SysUser> findByPage(SysUserDto sysUserDto, Integer pageNum, Integer pageSize);

    void saveSysUser(SysUser sysUser);

    void updateSysUser(SysUser sysUser);

    void deleteById(Long userId);

    void doAssign(AssignRoleDto assginRoleDto);
}
