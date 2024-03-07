package com.wxw.spzx.manager.mapper;

import com.wxw.spzx.model.dto.product.CategoryBrandDto;
import com.wxw.spzx.model.entity.product.Brand;
import com.wxw.spzx.model.entity.product.CategoryBrand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: CategoryBrandMapper
 * Package: com.wxw.spzx.manager.mapper
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/7 15:16
 * @Version 1.0
 */
@Mapper
public interface CategoryBrandMapper {
    public abstract List<CategoryBrand> findByPage(CategoryBrandDto CategoryBrandDto);

    void save(CategoryBrand categoryBrand);

    void updateById(CategoryBrand categoryBrand);

    void deleteById(Long id);

    List<Brand> findBrandByCategoryId(Long categoryId);
}
