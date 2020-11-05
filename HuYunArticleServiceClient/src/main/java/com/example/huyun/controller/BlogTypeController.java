package com.example.huyun.controller;

import com.example.huyun.entity.BlogType;
import com.example.huyun.service.BlogTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogTypeController {
    @Autowired
    BlogTypeService blogTypeService;

    @RequestMapping("/article/blog_type")
    public List<BlogType> query(){
        return blogTypeService.findAll();
    }
}
