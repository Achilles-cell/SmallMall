package com.wxw.spzx.product.mapper;

import com.wxw.spzx.model.entity.product.ProductDetails;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: ProductDetailsMapper
 * Package: com.wxw.spzx.product.mapper
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/10 15:59
 * @Version 1.0
 */
@Mapper
public interface ProductDetailsMapper {
    ProductDetails getByProductId(Long productId);
}
