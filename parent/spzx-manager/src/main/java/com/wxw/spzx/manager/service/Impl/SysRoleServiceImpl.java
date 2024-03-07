package com.wxw.spzx.manager.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wxw.spzx.manager.mapper.SysRoleMapper;
import com.wxw.spzx.manager.mapper.SysRoleUserMapper;
import com.wxw.spzx.manager.service.SysRoleService;
import com.wxw.spzx.model.dto.system.SysRoleDto;
import com.wxw.spzx.model.entity.system.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: SysRoleServiceImpl
 * Package: com.wxw.spzx.manager.service.Impl
 * Description:
 *
 * @Author 风雅颂
 * @Create 2023/12/21 13:54
 * @Version 1.0
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper ;

    @Autowired
    private SysRoleUserMapper sysRoleUserMapper ;

    @Override
    public PageInfo<SysRole> findByPage(SysRoleDto sysRoleDto, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum , pageSize) ;
        List<SysRole> sysRoleList = sysRoleMapper.findByPage(sysRoleDto) ;
        PageInfo<SysRole> pageInfo = new PageInfo(sysRoleList) ;
        return pageInfo;
    }

    @Override
    public void saveSysRole(SysRole sysRole) {
        sysRoleMapper.saveSysRole(sysRole) ;
    }

    @Override
    public void updateSysRole(SysRole sysRole) {
        sysRoleMapper.updateSysRole(sysRole) ;
    }

    @Override
    public void deleteById(Long roleId) {
        sysRoleMapper.deleteById(roleId) ;
    }

    @Override
    public Map<String, Object> findAllRoles(Long userId) {

        // 查询所有的角色数据
        List<SysRole> sysRoleList = sysRoleMapper.findAllRoles() ;

        // 查询当前登录用户的角色数据
        List<Long> sysRoles = sysRoleUserMapper.findSysUserRoleByUserId(userId);

        // 构建响应结果数据
        Map<String , Object> resultMap = new HashMap<>() ;
        resultMap.put("allRolesList" , sysRoleList) ;
        resultMap.put("sysUserRoles", sysRoles);

        return resultMap;
    }
}
