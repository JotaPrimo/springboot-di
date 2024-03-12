package com.andres.springboot.di.app.springbootdi.repositories;

import com.andres.springboot.di.app.springbootdi.entities.Product;

import java.util.Arrays;
import java.util.List;

public class ProductRepository {
    private List<Product> data;

    public ProductRepository() {
        this.data =  Arrays.asList(
                new Product(1L, "Memoria Corsair", 300L),
                new Product(2L, "Gabinete XP", 250L),
                new Product(3L, "Monitor LG 23P", 1250L),
                new Product(4L, "Pendrive", 25L)
        );
    }

    public List<Product> findAll() {
        return data;
    }

    public Product findById(Long idProduct) {
        return data.stream().
                filter(product -> product.getId().equals(idProduct))
                .findFirst()
                .orElse(null);
    }

}
