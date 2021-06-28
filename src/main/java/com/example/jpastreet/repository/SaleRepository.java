package com.example.jpastreet.repository;

import com.example.jpastreet.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Integer> {
}
