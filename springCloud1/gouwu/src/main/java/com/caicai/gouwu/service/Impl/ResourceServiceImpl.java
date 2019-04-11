package com.caicai.gouwu.service.Impl;

import com.caicai.gouwu.mapper.ResourceMapper;
import com.caicai.gouwu.pojo.Resource;
import com.caicai.gouwu.service.iResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceServiceImpl implements iResourceService {
    @Autowired
    private ResourceMapper resourceMapper;

    @Override
    public List<Resource> getResourceByIndexProductId(Integer productId) {
        List<Resource> resource = resourceMapper.getResourceByIndexProductId(productId);
        return resource;
    }


    @Override
    public Resource getResourceDownByIndexProductId(Integer index,Integer productId) {
        Resource resource = resourceMapper.getResourceDownByIndexProductId(index,productId);
        return resource;
    }

}
