package com.wxw.spzx.feign.product;

import com.wxw.spzx.model.dto.product.SkuSaleDto;
import com.wxw.spzx.model.entity.product.ProductSku;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * ClassName: ProductFeignClient
 * Package: com.wxw.spzx.feign.product
 * Description:
 *
 * @Author 风雅颂
 * @Create 2024/1/12 14:00
 * @Version 1.0
 */
@FeignClient(value = "service-product")
public interface ProductFeignClient {

    @GetMapping("/api/product/getBySkuId/{skuId}")
    ProductSku getBySkuId(@PathVariable("skuId") Long skuId) ;


    /**
     * 更新商品sku销量
     * @param skuSaleDtoList
     * @return
     */
    @PostMapping("/api/product/updateSkuSaleNum")
    Boolean updateSkuSaleNum(@RequestBody List<SkuSaleDto> skuSaleDtoList);
}
