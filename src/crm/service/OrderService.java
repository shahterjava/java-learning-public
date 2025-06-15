package crm.service;

import crm.model.Client;
import crm.model.Order;
import crm.repository.ClientRepository;
import crm.repository.OrderRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class OrderService {
    private final ClientRepository clientRepository;
    private final OrderRepository orderRepository;

    public OrderService(ClientRepository clientRepository, OrderRepository orderRepository) {
        this.clientRepository = clientRepository;
        this.orderRepository = orderRepository;
    }

    public boolean createOrder(UUID clientId, String description, double amount){
        Optional<Client> clientOpt = clientRepository.findById(clientId);
        if(clientOpt.isEmpty()){
            return false;
        }
        Order order = new Order(description, amount);
        orderRepository.add(order.getId(), order);
        return  true;
    }

    public List<Order> getAllOrders(){
        return orderRepository.findByAll();
    }
    public Optional<Order> findOrderById(UUID id){
        return orderRepository.findById(id);
    }

    public void removeOrder(UUID id){
        orderRepository.remove(id);
    }
}
