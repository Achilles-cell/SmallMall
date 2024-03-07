package com.wxw.spzx.manager.mapper;

import com.wxw.spzx.model.entity.product.ProductDetails;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: ProductDetailsMapper
 * Package: com.wxw.spzx.manager.mapper
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/8 12:16
 * @Version 1.0
 */
@Mapper
public interface ProductDetailsMapper {
    void save(ProductDetails productDetails);

    ProductDetails selectByProductId(Long id);

    void updateById(ProductDetails productDetails);

    void deleteByProductId(Long id);
}
