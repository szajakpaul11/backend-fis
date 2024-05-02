package com.company.project.model.repository;

import com.company.project.model.Promotion;

import java.util.List;

public interface PromotionRepository extends JpaRepository<Promotion, Long> {
    List<Promotion> findAll();

    ScopedValue<Object> findById(Long id);

    Promotion save(Promotion promotion);

    void deleteById(Long id);

    Promotion findByName(String name);
}
