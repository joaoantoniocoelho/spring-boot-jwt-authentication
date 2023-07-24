package com.example.demo.controller;

import com.example.demo.model.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
@Slf4j
public class ProductsController {

    @GetMapping
    public ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.ok(List.of(
                Product.builder().id(1L).name("Product 1").description("Description 1").build(),
                Product.builder().id(2L).name("Product 2").description("Description 2").build(),
                Product.builder().id(3L).name("Product 3").description("Description 3").build()
        ));
    }

    @PostMapping
    public ResponseEntity<Product> createProduct() {
        return ResponseEntity.ok(Product.builder().id(1L).name("Product 1").build());
    }
}
