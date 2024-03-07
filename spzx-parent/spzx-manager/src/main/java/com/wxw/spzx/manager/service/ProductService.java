package com.wxw.spzx.manager.service;

import com.github.pagehelper.PageInfo;
import com.wxw.spzx.model.dto.product.ProductDto;
import com.wxw.spzx.model.entity.product.Product;

/**
 * ClassName: ProductService
 * Package: com.wxw.spzx.manager.service
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/8 11:54
 * @Version 1.0
 */
public interface ProductService {

    PageInfo<Product> findByPage(Integer page, Integer limit, ProductDto productDto);

    void save(Product product);

    Product getById(Long id);

    void updateById(Product product);

    void deleteById(Long id);

    void updateAuditStatus(Long id, Integer auditStatus);

    void updateStatus(Long id, Integer status);
}
