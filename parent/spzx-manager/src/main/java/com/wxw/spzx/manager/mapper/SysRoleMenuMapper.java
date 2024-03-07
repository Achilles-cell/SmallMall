package com.wxw.spzx.manager.mapper;

import com.wxw.spzx.model.dto.system.AssignMenuDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: SysRoleMenuMapper
 * Package: com.wxw.spzx.manager.mapper
 * Description:
 *
 * @Author 风雅颂
 * @Create 2023/12/27 16:29
 * @Version 1.0
 */
@Mapper
public interface SysRoleMenuMapper {
    public abstract List<Long> findSysRoleMenuByRoleId(Long roleId);

    void deleteByRoleId(Long roleId);

    void doAssign(AssignMenuDto assginMenuDto);

    void updateSysRoleMenuIsHalf(Long id);
}
