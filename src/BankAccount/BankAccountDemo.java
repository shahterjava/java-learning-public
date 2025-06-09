package BankAccount;

import java.util.Scanner;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankSystem accounts = new BankSystem();
        accounts.loadAccountsFromFile("accounts.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в наш банк!");
        while (true){
            System.out.println();
            System.out.println("1.Зарегистрировать аккаунт\n2.Показать всех клиентов\n3.Найти аккаунт по имени\n4.Перевести деньги\n5.Выход");
            System.out.print("Выберите действие:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if(choice==1){
                int id = 0;
                System.out.print("Введите имя клиента:");
                String name = scanner.nextLine();
                System.out.print("Начальный баланс:");
                double balance = scanner.nextDouble();
                    if(balance<0) {
                        do {
                            System.out.println("Введите корректное значение, баланс должен быть больше нуля.");
                            balance = scanner.nextDouble();
                        }
                        while (balance > 0);

                    }
                BankAccount newAcc = new BankAccount(id, name, balance);
                accounts.addAccount(newAcc);
                System.out.println("Аккаунт был создан");
                accounts.saveAccountsToFile("accounts.txt");
            } else if (choice == 2) {
                accounts.showAllAccounts();
            }else if (choice == 3){
                System.out.println("Введите имя аккаунта:");
                String findName = scanner.nextLine();
                BankAccount acc = accounts.findAccountByOwner(findName);
                if(acc != null){
                    acc.showInfo();
                }else{
                    System.out.println("Аккаунт не найден.");
                }
            }else if(choice == 4){
                System.out.println("Кто отправляет");
                String from = scanner.nextLine();
                System.out.println("Куда отправляет?");
                String to = scanner.nextLine();
                System.out.println("Сколько отправляет?");
                double amount = scanner.nextDouble();

                BankAccount accFrom = accounts.findAccountByOwner(from);
                BankAccount accTo = accounts.findAccountByOwner(to);

                if(accFrom != null && accTo != null){
                    accFrom.transferTo(accTo, amount);
                }else {
                    System.out.println("Один или несколько из аккаунтов не найдены.");
                }
                accounts.saveAccountsToFile("accounts.txt");
            }else if(choice == 5){
                System.out.println("Всего вам доброго!");
                accounts.saveAccountsToFile("accounts.txt");
                break;
            }else{
                System.out.println("Вы задали некорректное значение операции. Попробуйте снова!");
            }
        }
        accounts.saveAccountsToFile("accounts.txt");
    }
}
