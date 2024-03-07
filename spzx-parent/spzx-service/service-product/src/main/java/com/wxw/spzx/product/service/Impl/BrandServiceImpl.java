package com.wxw.spzx.product.service.Impl;

import com.wxw.spzx.model.entity.product.Brand;
import com.wxw.spzx.product.mapper.BrandMapper;
import com.wxw.spzx.product.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: BrandServiceImpl
 * Package: com.wxw.spzx.product.service.Impl
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/10 15:39
 * @Version 1.0
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Cacheable(value = "brandList", key ="'ALL'" ,unless="#result.size() == 0")
    @Override
    public List<Brand> findAll() {
        return brandMapper.findAll();
    }

}