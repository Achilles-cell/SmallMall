package com.wxw.spzx.manager.controller;

import com.wxw.spzx.manager.service.SysMenuService;
import com.wxw.spzx.manager.service.SysUserService;
import com.wxw.spzx.manager.service.ValidateCodeService;
import com.wxw.spzx.model.dto.system.LoginDto;
import com.wxw.spzx.model.entity.system.SysUser;
import com.wxw.spzx.model.vo.common.Result;
import com.wxw.spzx.model.vo.common.ResultCodeEnum;
import com.wxw.spzx.model.vo.system.LoginVo;
import com.wxw.spzx.model.vo.system.SysMenuVo;
import com.wxw.spzx.model.vo.system.ValidateCodeVo;
import com.wxw.spzx.utils.AuthContextUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName: IndexController
 * Package: com.wxw.spzx.manager.controller
 * Description:
 *
 * @Author 风雅颂
 * @Create 2023/12/18 14:20
 * @Version 1.0
 */
@Tag(name = "用户接口")
@RestController
@RequestMapping(value = "/admin/system/index")
public class IndexController {

    @Autowired
    private SysUserService sysUserService ;

    @Autowired
    private ValidateCodeService validateCodeService;

    @Autowired
    private SysMenuService sysMenuService;

    @GetMapping(value = "/generateValidateCode")
    public Result<ValidateCodeVo> generateValidateCode() {
        ValidateCodeVo validateCodeVo = validateCodeService.generateValidateCode();
        return Result.build(validateCodeVo , ResultCodeEnum.SUCCESS) ;
    }

    @Operation(summary = "登录接口")
    @PostMapping(value = "/login")
    public Result<LoginVo> login(@RequestBody LoginDto loginDto) {
        LoginVo loginVo = sysUserService.login(loginDto) ;
        return Result.build(loginVo , ResultCodeEnum.SUCCESS) ;
    }

//    @GetMapping(value = "/getUserInfo")
//    public Result<SysUser> getUserInfo(@RequestHeader(name = "token") String token) {
//        SysUser sysUser = sysUserService.getUserInfo(token) ;
//        return Result.build(sysUser , ResultCodeEnum.SUCCESS) ;
//    }

    @GetMapping(value = "/getUserInfo")
    public Result<SysUser> getUserInfo() {
        return Result.build(AuthContextUtil.get()  , ResultCodeEnum.SUCCESS) ;
    }

    @GetMapping(value = "/logout")
    public Result logout(@RequestHeader(value = "token") String token) {
        sysUserService.logout(token) ;
        return Result.build(null , ResultCodeEnum.SUCCESS) ;
    }

    @GetMapping("/menus")
    public Result menus() {
        List<SysMenuVo> sysMenuVoList =  sysMenuService.findUserMenuList() ;
        return Result.build(sysMenuVoList , ResultCodeEnum.SUCCESS) ;
    }


}
