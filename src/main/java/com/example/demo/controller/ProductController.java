package com.example.demo.controller;

import com.example.demo.dto.ProductResponseDTO;
import com.example.demo.service.FakestoreproductService;
import com.example.demo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {
    @Autowired
    IProductService productService;
    @GetMapping("/products/{id}")
    public ProductResponseDTO getProductWithId(@PathVariable("id") long id) {
        return productService.getSingleProductWithId(id);
    }
}
