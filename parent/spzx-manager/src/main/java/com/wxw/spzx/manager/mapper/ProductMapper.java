package com.wxw.spzx.manager.mapper;

import com.wxw.spzx.model.dto.product.ProductDto;
import com.wxw.spzx.model.entity.product.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: ProductMapper
 * Package: com.wxw.spzx.manager.mapper
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/8 11:55
 * @Version 1.0
 */
@Mapper
public interface ProductMapper {

    List<Product> findByPage(ProductDto productDto);

    void save(Product product);

    Product selectById(Long id);

    void updateById(Product product);

    void deleteById(Long id);
}
