package com.product.management.product.service.event;

import com.product.management.domain.event.DomainEvent;
import com.product.management.product.service.entity.Product;

import java.time.ZonedDateTime;

public abstract class ProductEvent implements DomainEvent<Product> {
    private final Product product;
    private final ZonedDateTime createdAt;


    public ProductEvent(Product product, ZonedDateTime createdAt) {
        this.product = product;
        this.createdAt = createdAt;
    }

    public Product getProduct() {
        return product;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }
} 