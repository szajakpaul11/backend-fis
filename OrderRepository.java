package com.company.project.model.repository;

import com.company.project.model.Order;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    ScopedValue<Object> findById(Long id);

    void deleteById(Long id);

    Order save(Order order);

    List<Order> findAll();
}
