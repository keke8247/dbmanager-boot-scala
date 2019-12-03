package com.wdk.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Description:
 *              表元数据信息
 * @Author:wang_dk
 * @Date:2019/12/3 0003 21:15
 * @Version: v1.0
 **/
@Entity
@Table
public class MetaDatabase {
    @Id
    @GeneratedValue
    /**数据库ID*/
    private Integer id;

    /**数据库名称*/
    private String name;

    /**数据存放在HDFS文件系统路径*/
    private String location;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
