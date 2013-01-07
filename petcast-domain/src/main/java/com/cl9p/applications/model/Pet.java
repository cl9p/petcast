package com.cl9p.applications.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: lfaus
 * Create Date: 12/26/12
 * @version: @TODO Add Version Information
 * @TODO Add Java Doc Information
 */
public class Pet implements Serializable {
    private final static long serialVersionUID = 123459876L;

    protected String petId;
    protected String name;
    protected String description;
    protected Date addDate;
    protected Double listPrice;
    protected Category category;

    public Pet() {
    }

    public Pet(String petId, String name, String description, Date addDate, Double listPrice, Category category) {
        this.petId = petId;
        this.name = name;
        this.description = description;
        this.addDate = addDate;
        this.listPrice = listPrice;
        this.category = category;
    }

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
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

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Double getListPrice() {
        return listPrice;
    }

    public void setListPrice(Double listPrice) {
        this.listPrice = listPrice;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
