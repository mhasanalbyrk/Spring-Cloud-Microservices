package com.microservicemodules.service;

import com.microservicemodules.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Optional<Product> findById(Long id);

    List<Product> findAllProducts();

    Product createNewProduct(Product product);

    Optional<Product> findProductByCode(String code);
}