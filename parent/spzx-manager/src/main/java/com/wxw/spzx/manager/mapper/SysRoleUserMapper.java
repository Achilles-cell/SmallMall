package com.wxw.spzx.manager.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: SysRoleUserMapper
 * Package: com.wxw.spzx.manager.mapper
 * Description:
 *
 * @Author 风雅颂
 * @Create 2023/12/27 15:09
 * @Version 1.0
 */
@Mapper
public interface SysRoleUserMapper {

//    void doAssign(@Param("userId") Long userId,
//                  @Param("roleId") Long roleId);		// 添加关联关系
    void deleteByUserId(Long userId);				// 根据用户的id删除数据

    void doAssign(Long userId, Long roleId);

    List<Long> findSysUserRoleByUserId(Long userId);
}
