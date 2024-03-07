package com.wxw.ssyx.acl.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wxw.ssyx.model.acl.Admin;
import com.wxw.ssyx.vo.acl.AdminQueryVo;

/**
 * ClassName: AdminService
 * Package: com.wxw.ssyx.acl.service
 * Description:
 *
 * @Author 风雅颂
 * @Create 2023/11/27 20:01
 * @Version 1.0
 */
public interface AdminService extends IService<Admin> {

    //1 用户列表
    IPage<Admin> selectPageUser(Page<Admin> pageParam, AdminQueryVo adminQueryVo);
}
