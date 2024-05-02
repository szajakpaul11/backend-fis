package com.company.project.model;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private Long id;
    private String name;
    private String username;
    private String password;
    private List<Order> orders; // Lista de comenzi ale clientului
    private double balance; // Soldul clientului

    // Constructor
    public Client(Long id, String name, String username, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.orders = new ArrayList<>(); // Inițializăm lista de comenzi
        this.balance = 0; // Inițializăm soldul cu valoarea 0
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Metoda pentru adăugarea unei comenzi la lista de comenzi ale clientului
    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public Order getOrder() {
        return null;
    }

    // Alte metode specifice pentru gestionarea contului clientului pot fi adăugate aici, dacă este nevoie
}