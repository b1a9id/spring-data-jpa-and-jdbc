package com.b1a9idps.spring_data_jpa_and_jdbc.application.entity;

import java.time.Instant;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

// JPAと共存する場合、 @Table がJDBCで扱うべきエンティティと判断される
@Table("user")
public class JdbcUser {
    @Id
    private Integer id;

    private String name;

    private Integer age;

    @MappedCollection(idColumn = "id")
    private JdbcShop shop;

    @CreatedDate
    @ReadOnlyProperty
    private Instant createdAt;

    @LastModifiedDate
    @ReadOnlyProperty
    private Instant updatedAt;

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

    public JdbcShop getShop() {
        return shop;
    }

    public void setShop(JdbcShop shop) {
        this.shop = shop;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }
}
