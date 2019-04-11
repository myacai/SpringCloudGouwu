package com.caicai.gouwu.mapper;

import com.caicai.gouwu.pojo.Resource;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "resourceMapper")
public interface ResourceMapper {
    List<Resource> getResourceByIndexProductId(@Param("productId")Integer productId);
    Resource getResourceDownByIndexProductId(@Param("index")Integer index,@Param("productId")Integer productId);
}
