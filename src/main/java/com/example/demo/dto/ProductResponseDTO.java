package com.example.demo.dto;

import com.example.demo.entity.Rating;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDTO {
    private  long id;
    private String title ;
    private  String image ;
    private  String description;
    private  int price;
    private String category;

}
