package com.company.project.model.repository;

import com.company.project.model.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAll();

    ScopedValue<Object> findById(Long id);

    Product save(Product product);

    void deleteById(Long id);
}
