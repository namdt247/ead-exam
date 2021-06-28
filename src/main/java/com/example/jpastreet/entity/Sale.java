package com.example.jpastreet.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int SlNo;
    private String SalesmanID;
    private String SalesmanName;
    private String DOS;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "ProdID")
    private Product product;
    @Column(insertable = false, updatable = false)
    private int ProdID;

    public Sale(String id, String name, String DOS, Product product) {
        this.SalesmanID = id;
        this.SalesmanName = name;
        this.DOS = DOS;
        this.product = product;
    }
}
