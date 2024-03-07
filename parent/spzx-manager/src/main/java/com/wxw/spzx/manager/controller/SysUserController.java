package com.wxw.spzx.manager.controller;

import com.github.pagehelper.PageInfo;
import com.wxw.spzx.manager.service.SysUserService;
import com.wxw.spzx.model.dto.system.AssignRoleDto;
import com.wxw.spzx.model.dto.system.SysUserDto;
import com.wxw.spzx.model.entity.system.SysRole;
import com.wxw.spzx.model.entity.system.SysUser;
import com.wxw.spzx.model.vo.common.Result;
import com.wxw.spzx.model.vo.common.ResultCodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: SysUserController
 * Package: com.wxw.spzx.manager.controller
 * Description:
 *
 * @Author 风雅颂
 * @Create 2023/12/23 13:54
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/admin/system/sysUser")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService ;

    @GetMapping(value = "/findByPage/{pageNum}/{pageSize}") //get请求不需要在Dto加@requestbody
    public Result<PageInfo<SysRole>> findByPage(@PathVariable(value = "pageNum") Integer pageNum ,
                                                @PathVariable(value = "pageSize") Integer pageSize,
                                                SysUserDto sysUserDto) {
        PageInfo<SysUser> pageInfo = sysUserService.findByPage(sysUserDto , pageNum , pageSize) ;
        return Result.build(pageInfo , ResultCodeEnum.SUCCESS) ;
    }

    @PostMapping(value = "/saveSysUser")
    public Result saveSysUser(@RequestBody SysUser sysUser) {
        sysUserService.saveSysUser(sysUser) ;
        return Result.build(null , ResultCodeEnum.SUCCESS) ;
    }

    @PutMapping(value = "/updateSysUser")
    public Result updateSysUser(@RequestBody SysUser sysUser) {
        sysUserService.updateSysUser(sysUser) ;
        return Result.build(null , ResultCodeEnum.SUCCESS) ;
    }

    @DeleteMapping(value = "/deleteById/{userId}")
    public Result deleteById(@PathVariable(value = "userId") Long userId) {
        sysUserService.deleteById(userId) ;
        return Result.build(null , ResultCodeEnum.SUCCESS) ;
    }

    @PostMapping("/doAssign")
    public Result doAssign(@RequestBody AssignRoleDto assginRoleDto) {
        sysUserService.doAssign(assginRoleDto) ;
        return Result.build(null , ResultCodeEnum.SUCCESS) ;
    }

}
