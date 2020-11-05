package com.example.huyun.entity;


import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name="bf_blog_type")
public class BlogType {

    @Id
    @KeySql(useGeneratedKeys = true) //主键回填（插入数据库中，主键回回填至实体对象）
    private String id;

    private String name;
    private String pid;
    private Date created_date;
    private String last_modified_by;
    private String last_modified_date;
}
