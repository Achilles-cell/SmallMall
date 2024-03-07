package com.wxw.spzx.manager.mapper;

import com.wxw.spzx.model.entity.base.ProductUnit;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: ProductUnitMapper
 * Package: com.wxw.spzx.manager.mapper
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/8 12:11
 * @Version 1.0
 */
@Mapper
public interface ProductUnitMapper {
    List<ProductUnit> findAll();
}
