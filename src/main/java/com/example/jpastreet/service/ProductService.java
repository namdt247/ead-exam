package com.example.jpastreet.service;

import com.example.jpastreet.entity.Product;
import com.example.jpastreet.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Configurable
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> saveAll(List<Product> list) {
        return productRepository.saveAll(list);
    }

    public List<Product> list(){
        return productRepository.findAll();
    }
}
