package com.example.jpastreet.dto;

import com.example.jpastreet.entity.Sale;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SaleDTO {
    private String SalesmanID;
    private String SalesmanName;
    private String DOS;
    private int ProdID;

    public SaleDTO(Sale sale) {
        this.setSalesmanID(sale.getSalesmanID());
        this.setSalesmanName(sale.getSalesmanName());
        this.setDOS(sale.getDOS());
        this.setProdID(sale.getProdID());
    }
}
