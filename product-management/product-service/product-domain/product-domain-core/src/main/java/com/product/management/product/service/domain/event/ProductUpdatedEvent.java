package com.product.management.product.service.domain.event;

import com.product.management.product.service.domain.entity.Product;

import java.time.ZonedDateTime;

public class ProductUpdatedEvent  extends  ProductEvent{
    public ProductUpdatedEvent(Product product, ZonedDateTime createdAt) {
        super(product, createdAt);
    }
}
