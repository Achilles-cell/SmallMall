package com.wxw.spzx.manager.mapper;

import com.wxw.spzx.model.entity.system.SysMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: SysMenuMapper
 * Package: com.wxw.spzx.manager.mapper
 * Description:
 *
 * @Author 风雅颂
 * @Create 2023/12/27 15:54
 * @Version 1.0
 */
@Mapper
public interface SysMenuMapper {
    List<SysMenu> selectAll();

    void insert(SysMenu sysMenu);

    void updateById(SysMenu sysMenu);

    int countByParentId(Long id);

    void deleteById(Long id);

    List<SysMenu> selectListByUserId(Long userId);

    SysMenu selectById(Long parentId);
}
