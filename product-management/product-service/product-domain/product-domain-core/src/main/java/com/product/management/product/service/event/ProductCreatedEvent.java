package com.product.management.product.service.event;

import com.product.management.product.service.entity.Product;

import java.time.ZonedDateTime;

public class ProductCreatedEvent  extends  ProductEvent{
    public ProductCreatedEvent(Product product, ZonedDateTime createdAt) {
        super(product, createdAt);
    }
}
