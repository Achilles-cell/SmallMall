package com.wxw.spzx.manager.mapper;

import com.wxw.spzx.model.entity.product.ProductSpec;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: ProductSpecMapper
 * Package: com.wxw.spzx.manager.mapper
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/7 16:48
 * @Version 1.0
 */
@Mapper
public interface ProductSpecMapper {
    List<ProductSpec> findByPage();

    void save(ProductSpec productSpec);

    void updateById(ProductSpec productSpec);

    void deleteById(Long id);

    List<ProductSpec> findAll();
}
