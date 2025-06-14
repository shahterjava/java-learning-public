package crm.repository;

import crm.model.Client;

import java.util.*;

public class ClientRepository {
    private final Map<Integer, Client> clients = new HashMap<>();
    public void add(Client client){
        clients.put(client.getId(), client);
    }
    public Client findById(int id){
        return clients.get(id);
    }
    public List<Client> findAll(){
        return new ArrayList<>(clients.values());
    }
    public void remove(int id){
        clients.remove(id);
    }
}
