package com.wxw.spzx.product.mapper;

import com.wxw.spzx.model.dto.h5.ProductSkuDto;
import com.wxw.spzx.model.entity.product.ProductSku;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: ProductSkuMapper
 * Package: com.wxw.spzx.product.mapper
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/10 13:45
 * @Version 1.0
 */
@Mapper
public interface ProductSkuMapper {

    List<ProductSku> findProductSkuBySale();

    List<ProductSku> findByPage(ProductSkuDto productSkuDto);

    ProductSku getById(Long skuId);

    List<ProductSku> findByProductId(Long productId);

    void updateSale(Long skuId, Integer num);
}
