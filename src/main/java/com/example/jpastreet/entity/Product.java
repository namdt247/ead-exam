package com.example.jpastreet.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ProdID;
    private String ProdName;
    private String Description;
    private Date DateOfManf;
    private double Price;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Sale> sales;

    public void addSale(Sale sale) {
        if (this.sales == null) {
            this.sales = new HashSet<>();
        }
        this.sales.add(sale);
    }

    public Product(String name, String des, Date date, double price) {
        this.ProdName = name;
        this.Description = des;
        this.DateOfManf = date;
        this.Price = price;
    }
}
