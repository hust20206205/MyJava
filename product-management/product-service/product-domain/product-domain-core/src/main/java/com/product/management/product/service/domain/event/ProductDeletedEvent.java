package com.product.management.product.service.domain.event;

import com.product.management.product.service.domain.entity.Product;

import java.time.ZonedDateTime;

public class ProductDeletedEvent  extends  ProductEvent{
    public ProductDeletedEvent(Product product, ZonedDateTime createdAt) {
        super(product, createdAt);
    }
}
