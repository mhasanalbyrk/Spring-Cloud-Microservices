package com.microservicemodules.controller;

import com.microservicemodules.model.Product;
import com.microservicemodules.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAll(){

        return ResponseEntity.ok(productService.findAllProducts());
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<?> productById(@PathVariable String id){
//        return ResponseEntity.ok(productService.findById(Long.parseLong(id)));
//    }
    @GetMapping("/{code}")
    public ResponseEntity<?> productByCode(@PathVariable String code){
        return ResponseEntity.ok(productService.findProductByCode(code));
    }

    @PostMapping("/create")
    public ResponseEntity<?> createProduct(@RequestBody Product product){
        return ResponseEntity.ok(productService.createNewProduct(product));
    }

}
