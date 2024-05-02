package com.company.project.model.repository;

import com.company.project.model.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findAll();

    ScopedValue<Object> findById(Long id);

    Employee save(Employee employee);

    void deleteById(Long id);
}