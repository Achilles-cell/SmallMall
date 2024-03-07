package com.wxw.spzx.manager.service;

import com.wxw.spzx.model.entity.system.SysMenu;
import com.wxw.spzx.model.vo.system.SysMenuVo;

import java.util.List;

/**
 * ClassName: SysMenuService
 * Package: com.wxw.spzx.manager.service
 * Description:
 *
 * @Author 风雅颂
 * @Create 2023/12/27 15:52
 * @Version 1.0
 */
public interface SysMenuService {
    List<SysMenu> findNodes();

    void save(SysMenu sysMenu);

    void updateById(SysMenu sysMenu);

    void removeById(Long id);

    List<SysMenuVo> findUserMenuList();
}
