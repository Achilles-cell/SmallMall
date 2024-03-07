package com.wxw.spzx.product.service;

import com.wxw.spzx.model.entity.product.Brand;

import java.util.List;

/**
 * ClassName: BrandService
 * Package: com.wxw.spzx.product.service
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/10 15:39
 * @Version 1.0
 */
public interface BrandService {

    List<Brand> findAll();
}
