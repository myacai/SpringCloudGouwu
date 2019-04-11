package com.caicai.gouwu.mapper;

import com.caicai.gouwu.pojo.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component(value = "productMapper")
public interface ProductMapper {
    Product getProductByName(@Param("productName")String productName);
}
