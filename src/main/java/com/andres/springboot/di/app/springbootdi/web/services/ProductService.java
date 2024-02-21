package com.andres.springboot.di.app.springbootdi.web.services;

import com.andres.springboot.di.app.springbootdi.core.entities.Product;
import com.andres.springboot.di.app.springbootdi.infra.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository repository = new ProductRepository();

    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Product findById(Long id) {
        return repository.findById(id);
    }

}
