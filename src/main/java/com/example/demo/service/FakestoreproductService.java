package com.example.demo.service;

import com.example.demo.dto.ProductResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakestoreproductService implements IProductService{

    RestTemplate restTemplate=new RestTemplate();
    @Override
    public ProductResponseDTO getSingleProductWithId(Long id) {
        ProductResponseDTO response = restTemplate.getForObject("https://fakestoreapi.com/products/" + id, ProductResponseDTO.class);
        return response;
    }
}
