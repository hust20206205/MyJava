package com.product.management.product.service.domain.entity;

import com.product.management.domain.entity.AggregateRoot;
import com.product.management.domain.valueobject.ProductId;
import com.product.management.product.service.domain.exception.ProductDomainException;
import com.product.management.product.service.domain.valueobject.ProductStatus;

import java.util.List;
import java.util.UUID;

public class Product extends AggregateRoot<ProductId> {
   private    String name;
    private   ProductStatus productStatus;
    


    
    public void initializeProduct() {
        setId(new ProductId(UUID.randomUUID()));
        productStatus = ProductStatus.PENDING;
    }



    

    public void validateProduct() {
        if (getId() == null) {
            throw new ProductDomainException("Product id");
        }
        if (productStatus == null) {
            throw new ProductDomainException("Product status");
        }
        if (name == null) {
            throw new ProductDomainException("Product name");
        }
    }




public void create() {
    if (productStatus != ProductStatus.PENDING) {
        throw new ProductDomainException("Product PENDING");
    }
    productStatus = ProductStatus.ACTIVE;
}

public void update(String newName) {
    if (productStatus != ProductStatus.ACTIVE) {
        throw new ProductDomainException("Product ACTIVE");
    }
    name = newName;
}


public void delete() {
    if (productStatus == ProductStatus.DELETED) {
        throw new ProductDomainException("Product DELETED");
    }
    productStatus = ProductStatus.DELETED;
}



    private Product(Builder builder) {
   super.setId(builder.productId);
        name = builder.name;
        productStatus = builder.productStatus;
    }
        

    public static final class Builder {
        private ProductId productId;
        private String name;
        private ProductStatus productStatus;
        

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
    
}
