package com.cl9p.applications.model;

import java.io.Serializable;

/**
 * @author: lfaus
 * Create Date: 12/26/12
 * @version: @TODO Add Version Information
 * @TODO Add Java Doc Information
 */
public class Category implements Serializable {
    private final static long serialVersionUID = 123459876L;

    protected String categoryId;
    protected String name;
    protected String description;

    public Category() {
    }

    public Category(String categoryId, String name, String description) {
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
