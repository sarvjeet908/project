package com.example.demo.service;

import com.example.demo.dto.ProductResponseDTO;
import org.springframework.stereotype.Service;

@Service
public interface IProductService {
    public ProductResponseDTO getSingleProductWithId(Long id);
}
