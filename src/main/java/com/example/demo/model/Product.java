package com.example.demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Data
@Builder
public class Product {
    private Long id;
    private String name;
    private String description;
}
