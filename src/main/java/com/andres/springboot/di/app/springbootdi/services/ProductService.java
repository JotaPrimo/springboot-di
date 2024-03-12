package com.andres.springboot.di.app.springbootdi.services;

import com.andres.springboot.di.app.springbootdi.entities.Product;
import com.andres.springboot.di.app.springbootdi.repositories.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    // no service devo manipular os dados
    // controller deve ser o menor possivel
    // sem try cats

    private ProductRepository repository = new ProductRepository();

    public List<Product> findAll() {
        return repository.findAll().stream().map(product -> {
            product.setPrice(product.getPrice() * 2L);
            return product;
        }).collect(Collectors.toList());
    }

    public Product findById(Long idProduto) {
        return repository.findById(idProduto);
    }


}
