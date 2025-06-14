package crm.main;

import crm.model.Client;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Dmitriy", "sergeee@gmail.com", "+7 999 777 11 22");
        Client client2 = new Client("Sergei", "sergeee1@gmail.com", "+7 999 777 11 23");
        System.out.println(client.toString());
        System.out.println(client2.toString());
    }
}
