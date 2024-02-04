package com.product.management.product.service.event;

public class ProductUpdatedEvent  extends  ProductEvent{
    public ProductCreatedEvent(Product product, ZonedDateTime createdAt) {
        super(product, createdAt);
    }
}
