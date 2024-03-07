package com.wxw.spzx.manager.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wxw.spzx.manager.mapper.BrandMapper;
import com.wxw.spzx.manager.service.BrandService;
import com.wxw.spzx.model.entity.product.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: BrandServiceImpl
 * Package: com.wxw.spzx.manager.service.Impl
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/7 14:48
 * @Version 1.0
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper ;

    @Override
    public PageInfo<Brand> findByPage(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<Brand> brandList = brandMapper.findByPage() ;
        return new PageInfo(brandList);
    }

    @Override
    public void save(Brand brand) {
        brandMapper.save(brand) ;
    }

    @Override
    public void updateById(Brand brand) {
        brandMapper.updateById(brand) ;
    }

    @Override
    public void deleteById(Long id) {
        brandMapper.deleteById(id) ;
    }

    @Override
    public List<Brand> findAll() {
        return brandMapper.findAll();
    }
}
