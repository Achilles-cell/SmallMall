package com.wxw.spzx.manager.mapper;

import com.wxw.spzx.model.entity.product.ProductSku;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: ProductSkuMapper
 * Package: com.wxw.spzx.manager.mapper
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/8 12:16
 * @Version 1.0
 */
@Mapper
public interface ProductSkuMapper {

    void save(ProductSku productSku);

    List<ProductSku> selectByProductId(Long id);

    void updateById(ProductSku productSku);

    void deleteByProductId(Long id);
}
