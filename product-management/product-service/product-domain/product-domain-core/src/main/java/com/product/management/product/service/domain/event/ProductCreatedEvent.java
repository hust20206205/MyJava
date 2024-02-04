package com.product.management.product.service.domain.event;

import com.product.management.product.service.domain.entity.Product;

import java.time.ZonedDateTime;

public class ProductCreatedEvent  extends  ProductEvent{
    public ProductCreatedEvent(Product product, ZonedDateTime createdAt) {
        super(product, createdAt);
    }
}
