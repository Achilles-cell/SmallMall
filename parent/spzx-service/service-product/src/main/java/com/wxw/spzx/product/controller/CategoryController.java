package com.wxw.spzx.product.controller;

import com.wxw.spzx.model.entity.product.Category;
import com.wxw.spzx.model.vo.common.Result;
import com.wxw.spzx.model.vo.common.ResultCodeEnum;
import com.wxw.spzx.product.service.CategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName: CategoryController
 * Package: com.wxw.spzx.product.controller
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/10 14:05
 * @Version 1.0
 */
@Tag(name = "分类接口管理")
@RestController
//@CrossOrigin
@RequestMapping(value="/api/product/category")
@SuppressWarnings({"unchecked", "rawtypes"})
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Operation(summary = "获取分类树形数据")
    @GetMapping("findCategoryTree")
    public Result<List<Category>> findCategoryTree(){
        List<Category> list = categoryService.findCategoryTree();
        return Result.build(list,  ResultCodeEnum.SUCCESS);
    }

}
