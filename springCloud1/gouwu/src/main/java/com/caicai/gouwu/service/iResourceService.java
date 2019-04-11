package com.caicai.gouwu.service;

import com.caicai.gouwu.pojo.Resource;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface iResourceService {
    List<Resource> getResourceByIndexProductId(Integer productId);
    Resource getResourceDownByIndexProductId(Integer index,Integer productId);

}
