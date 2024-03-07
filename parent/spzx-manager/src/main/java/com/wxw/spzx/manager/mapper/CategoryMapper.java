package com.wxw.spzx.manager.mapper;

import com.wxw.spzx.model.entity.product.Category;
import com.wxw.spzx.model.vo.product.CategoryExcelVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.poi.ss.formula.functions.T;

import java.util.List;

/**
 * ClassName: CategoryMapper
 * Package: com.wxw.spzx.manager.mapper
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/6 14:09
 * @Version 1.0
 */
@Mapper
public interface CategoryMapper {
    List<Category> selectByParentId(Long parentId);
    int countByParentId(Long id);

    List<Category> selectAll();

    void batchInsert(List cachedDataList);
}
