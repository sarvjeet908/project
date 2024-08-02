package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequestDTO {
    private String title ;
    private  String image ;
    private  String description;
    private  int price;
    private String category;
}
