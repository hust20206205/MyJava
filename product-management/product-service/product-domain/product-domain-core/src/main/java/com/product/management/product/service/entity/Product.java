package com.product.management.product.service.entity;

import com.product.management.domain.entity.AggregateRoot;
import com.product.management.domain.valueobject.ProductId;
import com.product.management.product.service.valueobject.ProductStatus;

import java.util.List;

public class Product extends AggregateRoot<ProductId> {
   private final  String name;
    private   ProductStatus productStatus;
    private List<String> failureMessages;

    private Product(Builder builder) {
   super.setId(builder.productId);
        name = builder.name;
        productStatus = builder.productStatus;
        failureMessages = builder.failureMessages;
    }

    public static final class Builder {
        private ProductId productId;
        private String name;
        private ProductStatus productStatus;
        private List<String> failureMessages;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder productId(ProductId val) {
            productId = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder productStatus(ProductStatus val) {
            productStatus = val;
            return this;
        }

        public Builder failureMessages(List<String> val) {
            failureMessages = val;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }


    public String getName() {
        return name;
    }

    public ProductStatus getProductStatus() {
        return productStatus;
    }

    public List<String> getFailureMessages() {
        return failureMessages;
    }
}
