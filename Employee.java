package com.company.project.model;

public class Employee {
    private Long id;
    private String name;
    private Role role; // Tipul enum pentru rolul angajatului (junior sau senior)

    // Constructor
    public Employee(Long id, String name, Role role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    // Metodele getters și setters pentru câmpurile clasei
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    // Metoda toString pentru a afișa detaliile angajatului
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
}
