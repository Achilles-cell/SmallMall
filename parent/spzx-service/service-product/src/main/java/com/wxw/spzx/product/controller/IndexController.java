package com.wxw.spzx.product.controller;

import com.wxw.spzx.model.entity.product.Category;
import com.wxw.spzx.model.entity.product.ProductSku;
import com.wxw.spzx.model.vo.common.Result;
import com.wxw.spzx.model.vo.common.ResultCodeEnum;
import com.wxw.spzx.model.vo.h5.IndexVo;
import com.wxw.spzx.product.service.CategoryService;
import com.wxw.spzx.product.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName: IndexController
 * Package: com.wxw.spzx.product.controller
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/10 13:41
 * @Version 1.0
 */
@Tag(name = "首页接口管理")
//@CrossOrigin   //跨域
@RestController
@RequestMapping(value="/api/product/index")
@SuppressWarnings({"unchecked", "rawtypes"})
public class IndexController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService productService;

    @Operation(summary = "获取首页数据")
    @GetMapping
    public Result<IndexVo> findData(){
        // 1. 获取所有一级分类
        List<Category> categoryList = categoryService.findOneCategory();
        // 2. 根据销量排序，获取前10条记录
        List<ProductSku> productSkuList = productService.findProductSkuBySale();
        IndexVo indexVo = new IndexVo() ;
        indexVo.setCategoryList(categoryList);
        indexVo.setProductSkuList(productSkuList);
        return Result.build(indexVo , ResultCodeEnum.SUCCESS);
    }

}
