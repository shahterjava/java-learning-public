package crm.service;

import crm.model.Client;

import java.util.*;

public class ClientService {
    private final Map<UUID, Client> clients = new HashMap<>();

    public Client addClient(String name, String email, String number){
        if(name == null || name.isBlank()) throw new IllegalArgumentException("Имя не может быть пустым");
        if(email == null || !isValidEmail(email)) throw new IllegalArgumentException("Неверный email");
        if(number == null || number.isBlank()) throw new IllegalArgumentException("Телефон не может быть пустым.");

        String formattedPhone = formattedPhoneNumber(number);
        UUID id = UUID.randomUUID();
        Client client = new Client(id, name.trim(), email.trim(), formattedPhone);
        clients.put(id, client);
        return client;
    }
    private String formattedPhoneNumber(String number) {
        number = number.replaceAll("[^0-9]","");
        if (number.startsWith("8")){
            number = "7" + number.substring(1);
        }
        if(!number.startsWith("7")){
            return number;
        }
        return "+7" + number.substring(1,4) + ""+
                number.substring(4,7) + "-" +
                number.substring(7,9) + "-" +
                number.substring(9);
    }
    public boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
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
