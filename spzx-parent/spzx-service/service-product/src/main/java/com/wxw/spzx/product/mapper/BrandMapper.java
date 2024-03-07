package com.wxw.spzx.product.mapper;

import com.wxw.spzx.model.entity.product.Brand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: BrandMapper
 * Package: com.wxw.spzx.product.mapper
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/10 15:39
 * @Version 1.0
 */
@Mapper
public interface BrandMapper {

    List<Brand> findAll();

}
