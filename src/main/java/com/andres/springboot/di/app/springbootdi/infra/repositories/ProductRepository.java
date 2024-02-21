package com.andres.springboot.di.app.springbootdi.infra.repositories;

import com.andres.springboot.di.app.springbootdi.core.entities.Product;

import java.util.Arrays;
import java.util.List;

public class ProductRepository {

    private List<Product> data;

    public ProductRepository() {
        this.data = Arrays.asList(
                new Product(1L, "Memoria corsair 32", 850L),
                new Product(2L, "Monitor", 450L),
                new Product(3L, "Gabinete", 945L)
        );
    }

    public List<Product> findAll() {
        return data;
    }
}
