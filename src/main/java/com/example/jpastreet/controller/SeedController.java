package com.example.jpastreet.controller;

import com.example.jpastreet.entity.Product;
import com.example.jpastreet.entity.Sale;
import com.example.jpastreet.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping(value = "/seed/generate")
public class SeedController {
    @Autowired
    ProductService productService;

    @RequestMapping(method = RequestMethod.GET)
    public String seed(){
        Product product1 = new Product("Xe may Honda", "Xe may 125cc", Calendar.getInstance().getTime(), 2000);
        product1.addSale(new Sale("S001", "Nam", "Nhan vien ban hang", product1));

        Product product2 = new Product("Xe may Honda SH", "Xe may 125cc", Calendar.getInstance().getTime(), 2500);
        product2.addSale(new Sale("S002", "Dinh Nam", "Nhan vien ban hang", product2));

        Product product3 = new Product("Xe may Honda Vison", "Xe may 125cc", Calendar.getInstance().getTime(), 1500);
        product3.addSale(new Sale("S003", "Dinh Nam The", "Nhan vien ban hang", product3));

        Product product4 = new Product("Xe may Honda Future", "Xe may 125cc", Calendar.getInstance().getTime(), 2500);
        product4.addSale(new Sale("S004", "Dinh The Nam", "Nhan vien ban hang", product4));

        Product product5 = new Product("Xe may Honda Dream", "Xe may 125cc", Calendar.getInstance().getTime(), 2500);
        product5.addSale(new Sale("S005", "Dinh Nam", "Nhan vien ban hang", product5));

        Product product6 = new Product("Laptop Dell", "Chip intel", Calendar.getInstance().getTime(), 2500);
        product6.addSale(new Sale("S006", "Phuong Anh", "Nhan vien ban hang", product6));

        Product product7 = new Product("Laptop HP", "Chip intel", Calendar.getInstance().getTime(), 1500);
        product7.addSale(new Sale("S007", "Phuong An", "Nhan vien ban hang", product7));

        Product product8 = new Product("Macbook Pro", "Chip intel", Calendar.getInstance().getTime(), 2500);
        product8.addSale(new Sale("S008", "Phuong Anh Nguyen", "Nhan vien ban hang", product8));

        Product product9 = new Product("Macbook Pro M1", "Chip M1", Calendar.getInstance().getTime(), 2500);
        product9.addSale(new Sale("S009", "My Linh", "Nhan vien ban hang", product9));

        Product product10 = new Product("Macbook Pro 16inch", "Chip intel", Calendar.getInstance().getTime(), 2500);
        product10.addSale(new Sale("S010", "My Hao", "Nhan vien ban hang", product10));

        List<Product> products = Arrays.asList(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10);
        productService.saveAll(products);
        return "success!";
    }
}
