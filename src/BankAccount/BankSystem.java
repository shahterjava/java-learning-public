package BankAccount;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BankSystem {
    List<BankAccount> accounts = new ArrayList<>();
    private int nextId = 1;
    public void addAccount(BankAccount account){
        accounts.add(account);
    }
    public BankAccount findAccountByOwner(String owner) {
        for (BankAccount account : accounts)
            if (account.getOwner().equals(owner)) {
                return account;
            }
            return null;

    }
    public void showAllAccounts(){
        for (BankAccount account : accounts) {
            account.showInfo();
        }
    }

    public void loadAccountsFromFile(String fileName){
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = reader.readLine()) != null){
                String [] parts = line.split(";");
                if(parts.length == 3){
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    double balance = Double.parseDouble(parts[2]);
                    addAccount(new BankAccount(id, name, balance));
                }
            }

        }catch (IOException e) {
            System.out.println("Файл не найден. Начнем с новой базы.");
        }
    }
    public void saveAccountsToFile(String fileName){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            for (BankAccount account : accounts) {
                writer.write(account.getId()+ ";" + account.getOwner() + ";" + account.getBalance());
                writer.newLine();
            }


        }catch (IOException e){
            System.out.println("Ошибка при загрузке файла:" + e.getMessage());
        }
    }



}
