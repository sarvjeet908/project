package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
@Getter
@Setter
@Component
public class Product {
    private long id;
    private String name;
    private String desc;
    private String image;
    private int    price;
    private Category category;
}
