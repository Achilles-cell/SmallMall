package com.wxw.spzx.manager.controller;

import com.wxw.spzx.manager.service.SysMenuService;
import com.wxw.spzx.model.entity.system.SysMenu;
import com.wxw.spzx.model.vo.common.Result;
import com.wxw.spzx.model.vo.common.ResultCodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName: SysMenuController
 * Package: com.wxw.spzx.manager.controller
 * Description:
 *
 * @Author 风雅颂
 * @Create 2023/12/27 15:51
 * @Version 1.0
 */
@RestController
@RequestMapping(value="/admin/system/sysMenu")
public class SysMenuController {

    @Autowired
    private SysMenuService sysMenuService;

    @GetMapping("/findNodes")
    public Result<List<SysMenu>> findNodes() {
        List<SysMenu> list = sysMenuService.findNodes();
        return Result.build(list , ResultCodeEnum.SUCCESS) ;
    }

    @PostMapping("/save")
    public Result save(@RequestBody SysMenu sysMenu) {
        sysMenuService.save(sysMenu);
        return Result.build(null , ResultCodeEnum.SUCCESS) ;
    }

    @PutMapping("/updateById")
    public Result updateById(@RequestBody SysMenu sysMenu) {
        sysMenuService.updateById(sysMenu);
        return Result.build(null , ResultCodeEnum.SUCCESS) ;
    }

    @DeleteMapping("/removeById/{id}")
    public Result removeById(@PathVariable Long id) {
        sysMenuService.removeById(id);
        return Result.build(null , ResultCodeEnum.SUCCESS) ;
    }

}
