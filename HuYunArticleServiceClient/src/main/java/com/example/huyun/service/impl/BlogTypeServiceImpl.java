package com.example.huyun.service.impl;

import com.example.huyun.entity.BlogType;
import com.example.huyun.mapper.BlogTypeMapper;
import com.example.huyun.service.BlogTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogTypeServiceImpl implements BlogTypeService {

    @Autowired
    BlogTypeMapper blogTypeMapper;
    @Override
    public List<BlogType> findAll() {
        return blogTypeMapper.selectAll();
    }
}
