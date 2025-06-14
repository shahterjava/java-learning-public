package crm.repository;

import crm.model.Client;

import java.util.*;

public class ClientRepository {
    private final Map<UUID, Client> clients = new HashMap<>();
    public void add(Client client){
        clients.put(client.getId(), client);
    }
    public Optional<Client> findById(UUID id){
        return Optional.ofNullable(clients.get(id));
    }
    public List<Client> findAll(){
        return new ArrayList<>(clients.values());
    }
    public void remove(UUID id){
        clients.remove(id);
    }
}
