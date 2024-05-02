package com.company.project.model;

public class Order {
    private Long id;
    private Long productId; // Id-ul produsului comandat
    private Long clientId; // Id-ul clientului care a plasat comanda
    private OrderType type; // Tipul comenzii: "cumparare" sau "service"
    private OrderStatus status; // Statusul comenzii

    private String description; // Descrierea comenzii

    // Constructor
    public Order(Long id, Long productId, Long clientId, OrderType type, OrderStatus status, String description) {
        this.id = id;
        this.productId = productId;
        this.clientId = clientId;
        this.type = type;
        this.status = status;
        this.description = description;
    }

    // Metodele getters și setters pentru câmpurile clasei
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public OrderType getType() {
        return type;
    }

    public void setType(OrderType type) {
        this.type = type;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Metoda toString pentru a afișa detaliile comenzii
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", productId=" + productId +
                ", clientId=" + clientId +
                ", type=" + type +
                ", status=" + status +
                ", description='" + description + '\'' +
                '}';
    }

    public Product[] getProducts() {
        return new Product[0];
    }

    public Client getClient() {
        return null;
    }
}
