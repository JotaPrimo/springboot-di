package com.andres.springboot.di.app.springbootdi.infra.repositories.interfaces;

import com.andres.springboot.di.app.springbootdi.core.entities.Product;

import java.util.List;

public interface IProductRepository {
    public Product findById(Long idProduct);
    public List<Product> findAll();
}
