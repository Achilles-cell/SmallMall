package com.wxw.spzx.manager.service;

import com.github.pagehelper.PageInfo;
import com.wxw.spzx.model.entity.product.Brand;

import java.util.List;

/**
 * ClassName: BrandService
 * Package: com.wxw.spzx.manager.service
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/7 14:47
 * @Version 1.0
 */
public interface BrandService {

    PageInfo<Brand> findByPage(Integer page, Integer limit);

    void save(Brand brand);

    void updateById(Brand brand);

    void deleteById(Long id);

    List<Brand> findAll();
}
