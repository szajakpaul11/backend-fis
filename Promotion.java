package com.company.project.model;

import java.util.List;

public class Promotion {
    private Long id;
    private String name;
    private List<Long> productIds; // Id-urile produselor incluse în promoție

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<Long> productIds) {
        this.productIds = productIds;
    }
}
