package com.example.huyun.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Data
@Table(name="bf_blog_article")
public class BlogArticle {
    @Id
    @KeySql(useGeneratedKeys = true) //主键回填（插入数据库中，主键回回填至实体对象）
    private String id;

    private String name;
    private String content;
    private Integer status;
    private Date publish_date;
    private Integer blog_type;
    private String source_url;
    private String created_by;
    private Date created_date;
    private String last_modified_by;
    private String last_modified_date;
}
