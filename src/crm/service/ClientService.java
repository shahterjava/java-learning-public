package crm.service;

import crm.model.Client;

import java.util.*;

public class ClientService {
    private final Map<UUID, Client> clients = new HashMap<>();

    public boolean addClient(String name, String email, String number){
        if(name == null || name.isBlank() || email == null || email.isBlank() || number == null || number.trim().length() < 10){
            return false;
        }

        Client client = new Client(name, email, number);
        clients.put(client.getId(), client);
        return true;
    }
    public Client getClientById(UUID id){
        return clients.get(id);
    }

    public List<Client> getAllClients(){
        return new ArrayList<>(clients.values());
    }

    public void removeClient(UUID id){
        clients.remove(id);
    }
}
