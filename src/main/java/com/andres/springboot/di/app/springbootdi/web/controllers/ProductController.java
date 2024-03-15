package com.andres.springboot.di.app.springbootdi.web.controllers;

import com.andres.springboot.di.app.springbootdi.core.config.ApiPaths;
import com.andres.springboot.di.app.springbootdi.core.entities.Product;
import com.andres.springboot.di.app.springbootdi.web.services.interfaces.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(ApiPaths.PRODUCT)
public class ProductController {

    @Autowired
    private IProductService service;

    @GetMapping
    public List<Product> list() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Product show(@PathVariable Long id) {
        return service.findById(id);
    }

}
