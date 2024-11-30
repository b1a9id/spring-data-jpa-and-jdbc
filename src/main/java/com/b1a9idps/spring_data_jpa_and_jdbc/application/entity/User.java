package com.b1a9idps.spring_data_jpa_and_jdbc.application.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

// JPAと共存する場合、 @Table がJDBCで扱うべきエンティティと判断される
@Table("user")
public class User {
    @Id
    private Integer id;

    private String name;

    private Integer age;

    private Integer shopId;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
}
