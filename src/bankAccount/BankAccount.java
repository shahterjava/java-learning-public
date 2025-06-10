package bankAccount;

import java.io.Serializable;

public class BankAccount implements Serializable {
    private String owner;
    private double balance;

    private static int nextId = 1;

    private int id;

    public BankAccount(int id, String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        this.id = nextId++;
    }

    public BankAccount(String owner, double balance, int id) {
        this.owner = owner;
        this.balance = balance;
        this.id = id;
        if(id>= nextId){
            nextId = id +1;
        }
    }

    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("На счете недостаточно средств!");
        }else {
            balance -= amount;
        }
    }
    public void showInfo(){
        System.out.println("Владелец счета: "+ getOwner() + ". Баланс: "+ getBalance()+".");
    }

    public void transferTo(BankAccount other, double amount){
        if (amount > balance) {
            System.out.println("Для перевода недостаточно средств.");
        }else{
            balance-=amount;
            other.balance += amount;
            System.out.println("Был осуществлен в перевод в размере: "+ amount+" рублей." +
                    " Перевод отправлен: "+ other.owner);
        }
    }
    public int getId() {
        return id;
    }
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | " + owner + " | Balance: " + balance;

    }
}
