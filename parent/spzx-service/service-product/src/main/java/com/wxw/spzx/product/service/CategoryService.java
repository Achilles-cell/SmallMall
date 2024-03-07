package com.wxw.spzx.product.service;

import com.wxw.spzx.model.entity.product.Category;

import java.util.List;

/**
 * ClassName: CategoryService
 * Package: com.wxw.spzx.product.service
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/10 13:41
 * @Version 1.0
 */
public interface CategoryService {

    List<Category> findOneCategory();

    List<Category> findCategoryTree();

}
