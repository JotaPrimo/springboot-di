package com.andres.springboot.di.app.springbootdi.web.services.interfaces;

import com.andres.springboot.di.app.springbootdi.core.entities.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findAll();
    public Product findById(Long id);
}
