package com.andres.springboot.di.app.springbootdi.infra.repositories;

import com.andres.springboot.di.app.springbootdi.core.entities.Product;
import com.andres.springboot.di.app.springbootdi.infra.repositories.interfaces.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements IProductRepository {

    private List<Product> data;

    public ProductRepositoryImpl() {
        this.data = Arrays.asList(
                new Product(1L, "Memoria corsair 32", 850L),
                new Product(2L, "Monitor", 450L),
                new Product(3L, "Gabinete", 945L)
        );
    }

    public List<Product> findAll() {
        return data;
    }

    public Product findById(Long id) {
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }
}
