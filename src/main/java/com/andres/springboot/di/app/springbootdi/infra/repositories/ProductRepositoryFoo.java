package com.andres.springboot.di.app.springbootdi.infra.repositories;

import com.andres.springboot.di.app.springbootdi.core.entities.Product;
import com.andres.springboot.di.app.springbootdi.infra.interfaces.IProductRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Primary
@Repository
public class ProductRepositoryFoo implements IProductRepository {
    @Override
    public Product findById(Long idProduct) {
       return new Product(idProduct, "Gabinete Asus", 250L);
    }

    @Override
    public List<Product> findAll() {
        return Collections.singletonList(new Product(1L, "Monitor AOC", 600L));
    }
}
