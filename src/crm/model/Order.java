package crm.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Order {
    private String id;
    private String description;
    private double amount;
    private OrderStatus status; // "NEW" , "IN_PROGRESS" , "COMPLETED"
    private LocalDateTime createdAt;

    public Order(String description, double amount) {
        this.id = UUID.randomUUID().toString();
        this.description = description;
        this.amount = amount;
        this.status = OrderStatus.NEW;
        this.createdAt = LocalDateTime.now();

    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

}
