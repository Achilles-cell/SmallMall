package com.wxw.spzx.product.service;

import com.github.pagehelper.PageInfo;
import com.wxw.spzx.model.dto.h5.ProductSkuDto;
import com.wxw.spzx.model.dto.product.SkuSaleDto;
import com.wxw.spzx.model.entity.product.ProductSku;
import com.wxw.spzx.model.vo.h5.ProductItemVo;

import java.util.List;

/**
 * ClassName: ProductService
 * Package: com.wxw.spzx.product.service
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/10 13:45
 * @Version 1.0
 */
public interface ProductService {

    List<ProductSku> findProductSkuBySale();

    PageInfo<ProductSku> findByPage(Integer page, Integer limit, ProductSkuDto productSkuDto);

    ProductItemVo item(Long skuId);

    ProductSku getBySkuId(Long skuId);

    Boolean updateSkuSaleNum(List<SkuSaleDto> skuSaleDtoList);
}
