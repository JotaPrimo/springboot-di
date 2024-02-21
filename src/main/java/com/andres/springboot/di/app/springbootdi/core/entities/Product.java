package com.andres.springboot.di.app.springbootdi.core.entities;

import lombok.*;

import java.util.Objects;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Product {
    private Long id;
    private String name;
    private Long price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
