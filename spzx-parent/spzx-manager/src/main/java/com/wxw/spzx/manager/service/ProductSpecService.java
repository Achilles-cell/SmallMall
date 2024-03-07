package com.wxw.spzx.manager.service;

import com.github.pagehelper.PageInfo;
import com.wxw.spzx.model.entity.product.ProductSpec;

import java.util.List;

/**
 * ClassName: ProductSpecService
 * Package: com.wxw.spzx.manager.service
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/7 16:47
 * @Version 1.0
 */
public interface ProductSpecService {

    PageInfo<ProductSpec> findByPage(Integer page, Integer limit);

    void save(ProductSpec productSpec);

    void updateById(ProductSpec productSpec);

    void deleteById(Long id);

    List<ProductSpec> findAll();
}
