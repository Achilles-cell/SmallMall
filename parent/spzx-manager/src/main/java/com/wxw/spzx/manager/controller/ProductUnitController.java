package com.wxw.spzx.manager.controller;

import com.wxw.spzx.manager.service.ProductUnitService;
import com.wxw.spzx.model.entity.base.ProductUnit;
import com.wxw.spzx.model.vo.common.Result;
import com.wxw.spzx.model.vo.common.ResultCodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName: ProductUnitController
 * Package: com.wxw.spzx.manager.controller
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/8 12:09
 * @Version 1.0
 */
@RestController
@RequestMapping("/admin/product/productUnit")
public class ProductUnitController {

    @Autowired
    private ProductUnitService productUnitService;

    @GetMapping("findAll")
    public Result<List<ProductUnit>> findAll() {
        List<ProductUnit> productUnitList = productUnitService.findAll();
        return Result.build(productUnitList , ResultCodeEnum.SUCCESS) ;
    }
}
