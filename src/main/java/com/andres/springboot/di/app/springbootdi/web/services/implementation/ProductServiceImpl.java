package com.andres.springboot.di.app.springbootdi.web.services.implementation;

import com.andres.springboot.di.app.springbootdi.core.entities.Product;
import com.andres.springboot.di.app.springbootdi.infra.repositories.interfaces.IProductRepository;
import com.andres.springboot.di.app.springbootdi.web.services.interfaces.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductRepository repository;

    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Product findById(Long id) {
        return repository.findById(id);
    }
}
