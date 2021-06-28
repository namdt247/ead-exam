package com.example.jpastreet.service;

import com.example.jpastreet.entity.Sale;
import com.example.jpastreet.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

@Service
@Configurable
public class SaleService {
    @Autowired
    SaleRepository saleRepository;

    public Sale create(Sale sale) {
        return saleRepository.save(sale);
    }
}
