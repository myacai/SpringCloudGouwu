package com.caicai.gouwu.service.Impl;

import com.caicai.gouwu.service.iGouwuListService;
import com.caicai.gouwu.util.PageBean;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GouwuListServiceImpl implements iGouwuListService {

    /*@Autowired
    FirstAppGouwulistMapper firstAppGouwulistMapper;

    @Override
    public List<FirstAppGouwulist> getAllGouwuList() {
        Integer currentPage = 1;
        Integer pageSize = 2;
        PageHelper.startPage(currentPage, pageSize);
        List<FirstAppGouwulist> firstAppGouwulists = firstAppGouwulistMapper.getAll();

        Integer countNums = 8;
        PageBean<FirstAppGouwulist> pageData = new PageBean<>(currentPage, pageSize, countNums);
        pageData.setItems(firstAppGouwulists);
        //List<FirstAppGouwulist> firstAppGouwulists = firstAppGouwulistMapper.getAll();
        return pageData.getItems();
    }
    */
}
