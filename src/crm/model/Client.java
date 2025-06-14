package crm.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Client {
    private UUID id;
    private String name;
    private String email;
    private String phone;
    private static int nextId = 1;
    private List<Order> orders = new ArrayList<>();

    public Client(String name, String email, String phone) {

        this.name = name;
        this.email = email;
        this.phone = phone;
        nextId++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id && Objects.equals(name, client.name) && Objects.equals(email, client.email) && Objects.equals(phone, client.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, phone);
    }

    @Override
    public String toString() {
        return "Клиент: [" +
                "id=" + id +
                ", имя='" + name + '\'' +
                ", email='" + email + '\'' +
                ", номер телефона ='" + phone + '\'' +
                ", действия =" + orders +
                '}';
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
