package com.b1a9idps.spring_data_jpa_and_jdbc.application.entity;

import java.time.LocalDateTime;
import java.util.Set;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

@Table("shop")
public class JdbcShop {
    @Id
    private Integer id;

    private String name;

    @MappedCollection(idColumn = "id")
    private Set<JdbcUser> users;

    @CreatedDate
    @ReadOnlyProperty
    private LocalDateTime createdAt;

    @LastModifiedDate
    @ReadOnlyProperty
    private LocalDateTime updatedAt;

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

    public Set<JdbcUser> getUsers() {
        return users;
    }

    public void setUsers(Set<JdbcUser> users) {
        this.users = users;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
