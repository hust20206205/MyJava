package com.product.management.product.service.domain;

import com.product.management.product.service.domain.entity.Product;
import com.product.management.product.service.domain.event.ProductCreatedEvent;
import com.product.management.product.service.domain.event.ProductDeletedEvent;
import com.product.management.product.service.domain.event.ProductUpdatedEvent;

import java.util.List;


public interface ProductDomainService {
    ProductCreatedEvent createProduct(Product product);
    Product readProductById(int productId);
ProductUpdatedEvent updateProduct(Product product);
ProductDeletedEvent deleteProduct(int productId);
    List<Product> getAllProducts();
}
