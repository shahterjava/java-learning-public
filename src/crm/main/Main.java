package crm.main;

import crm.model.Client;
import crm.repository.ClientRepository;
import crm.repository.OrderRepository;
import crm.service.ClientService;
import crm.service.OrderService;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        ClientService clients = new ClientService();
        ClientRepository clientRepository = new ClientRepository();
        OrderRepository orderRepository = new OrderRepository();
        OrderService orders = new OrderService(clientRepository, orderRepository);

        clients.addClient("Dmitriy", "sergee@gmail.com", "89234113311");
        clients.addClient("Andrey", "sergee1@gmail.com", "89241122121");
        Client alexei = clients.addClient("Alexei", "sergee@gmail.com", "89251122121");
        System.out.println(clients.getAllClients());
        clientRepository.add(alexei);

        orders.createOrder(alexei.getId() , "Новые штаны.", 1200.0);
        System.out.println(orders.getAllOrders());

    }
}
