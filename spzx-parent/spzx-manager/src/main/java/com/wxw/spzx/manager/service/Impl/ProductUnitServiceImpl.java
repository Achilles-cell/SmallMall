package com.wxw.spzx.manager.service.Impl;

import com.wxw.spzx.manager.mapper.ProductUnitMapper;
import com.wxw.spzx.manager.service.ProductUnitService;
import com.wxw.spzx.model.entity.base.ProductUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: ProductUnitServiceImpl
 * Package: com.wxw.spzx.manager.service.Impl
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/8 12:10
 * @Version 1.0
 */
@Service
public class ProductUnitServiceImpl implements ProductUnitService {

    @Autowired
    private ProductUnitMapper productUnitMapper ;

    @Override
    public List<ProductUnit> findAll() {
        return productUnitMapper.findAll() ;
    }
}
