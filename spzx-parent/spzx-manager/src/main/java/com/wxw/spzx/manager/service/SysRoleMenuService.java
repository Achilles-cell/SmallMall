package com.wxw.spzx.manager.service;

import com.wxw.spzx.model.dto.system.AssignMenuDto;

import java.util.Map;

/**
 * ClassName: SysRoleMenuService
 * Package: com.wxw.spzx.manager.service
 * Description:
 *
 * @Author 风雅颂
 * @Create 2023/12/27 16:28
 * @Version 1.0
 */
public interface SysRoleMenuService {
    Map<String, Object> findSysRoleMenuByRoleId(Long roleId);

    void doAssign(AssignMenuDto assginMenuDto);
}
