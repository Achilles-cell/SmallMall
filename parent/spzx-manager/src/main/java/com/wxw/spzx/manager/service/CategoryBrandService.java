package com.wxw.spzx.manager.service;

import com.github.pagehelper.PageInfo;
import com.wxw.spzx.model.dto.product.CategoryBrandDto;
import com.wxw.spzx.model.entity.product.Brand;
import com.wxw.spzx.model.entity.product.CategoryBrand;

import java.util.List;

/**
 * ClassName: CategoryBrandService
 * Package: com.wxw.spzx.manager.service
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/7 15:15
 * @Version 1.0
 */
public interface CategoryBrandService {

    PageInfo<CategoryBrand> findByPage(Integer page, Integer limit, CategoryBrandDto CategoryBrandDto);

    void save(CategoryBrand categoryBrand);

    void updateById(CategoryBrand categoryBrand);

    void deleteById(Long id);

    List<Brand> findBrandByCategoryId(Long categoryId);
}
