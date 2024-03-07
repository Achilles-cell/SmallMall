package com.wxw.ssyx.acl.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wxw.ssyx.model.acl.Permission;

import java.util.List;

/**
 * ClassName: PermissionService
 * Package: com.wxw.ssyx.acl.service
 * Description:
 *
 * @Author 风雅颂
 * @Create 2023/11/27 20:01
 * @Version 1.0
 */
public interface PermissionService extends IService<Permission> {

    //查询所有菜单
    List<Permission> queryAllPermission();

    //递归删除菜单
    void removeChildById(Long id);
}
