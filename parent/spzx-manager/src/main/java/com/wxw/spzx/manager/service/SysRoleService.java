package com.wxw.spzx.manager.service;

import com.github.pagehelper.PageInfo;
import com.wxw.spzx.model.dto.system.SysRoleDto;
import com.wxw.spzx.model.entity.system.SysRole;

import java.util.Map;

/**
 * ClassName: SysRoleService
 * Package: com.wxw.spzx.manager.service
 * Description:
 *
 * @Author 风雅颂
 * @Create 2023/12/21 13:53
 * @Version 1.0
 */
public interface SysRoleService {
    PageInfo<SysRole> findByPage(SysRoleDto sysRoleDto, Integer pageNum, Integer pageSize);

    void saveSysRole(SysRole sysRole);

    void updateSysRole(SysRole sysRole);

    void deleteById(Long roleId);

    Map<String, Object> findAllRoles(Long userId);
}
