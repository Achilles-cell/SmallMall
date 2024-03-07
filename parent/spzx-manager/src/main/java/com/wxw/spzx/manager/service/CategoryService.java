package com.wxw.spzx.manager.service;

import com.wxw.spzx.model.entity.product.Category;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * ClassName: CategoryService
 * Package: com.wxw.spzx.manager.service
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/6 14:07
 * @Version 1.0
 */
public interface CategoryService {

    List<Category> findByParentId(Long parentId);

    void exportData(HttpServletResponse response);

    void importData(MultipartFile file);
}
