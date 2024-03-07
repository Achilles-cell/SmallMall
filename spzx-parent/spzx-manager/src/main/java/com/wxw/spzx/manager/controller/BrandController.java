package com.wxw.spzx.manager.controller;

import com.github.pagehelper.PageInfo;
import com.wxw.spzx.manager.service.BrandService;
import com.wxw.spzx.model.entity.product.Brand;
import com.wxw.spzx.model.vo.common.Result;
import com.wxw.spzx.model.vo.common.ResultCodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName: BrandController
 * Package: com.wxw.spzx.manager.controller
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/7 14:47
 * @Version 1.0
 */
@RestController
@RequestMapping(value="/admin/product/brand")
public class BrandController {

    @Autowired
    private BrandService brandService ;

    @GetMapping("/{page}/{limit}")
    public Result<PageInfo<Brand>> findByPage(@PathVariable Integer page, @PathVariable Integer limit) {
        PageInfo<Brand> pageInfo = brandService.findByPage(page, limit);
        return Result.build(pageInfo , ResultCodeEnum.SUCCESS) ;
    }

    @PostMapping("save")
    public Result save(@RequestBody Brand brand) {
        brandService.save(brand);
        return Result.build(null , ResultCodeEnum.SUCCESS) ;
    }

    @PutMapping("updateById")
    public Result updateById(@RequestBody Brand brand) {
        brandService.updateById(brand);
        return Result.build(null , ResultCodeEnum.SUCCESS) ;
    }

    @DeleteMapping("/deleteById/{id}")
    public Result deleteById(@PathVariable Long id) {
        brandService.deleteById(id);
        return Result.build(null , ResultCodeEnum.SUCCESS) ;
    }


    @GetMapping("/findAll")
    public Result findAll() {
        List<Brand> list = brandService.findAll();
        return Result.build(list , ResultCodeEnum.SUCCESS) ;
    }

}