package com.wxw.spzx.product.mapper;

import com.wxw.spzx.model.entity.product.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: CategoryMapper
 * Package: com.wxw.spzx.product.mapper
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/10 13:42
 * @Version 1.0
 */
@Mapper
public interface CategoryMapper {

    List<Category> findOneCategory();

    List<Category> findAll();
}
