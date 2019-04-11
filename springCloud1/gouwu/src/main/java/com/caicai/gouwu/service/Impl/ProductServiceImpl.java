package com.caicai.gouwu.service.Impl;

import com.caicai.gouwu.mapper.ProductMapper;
import com.caicai.gouwu.pojo.Product;
import com.caicai.gouwu.service.iProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements iProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public Product getProductByName(String productName) {
        Product product = productMapper.getProductByName(productName);

        return product;
    }
}
