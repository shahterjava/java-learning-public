package BankAccount;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(double amount){
        balance += amount;
    }
    void withdraw(double amount){
        if(amount>balance){
            System.out.println("На счете недостаточно средств!");
        }else {
            balance -= amount;
        }
    }
    void showInfo(){
        System.out.println("Владелец счета: "+ getOwner() + ". Баланс: "+ getBalance()+".");
    }

    void transferTo(BankAccount other, double amount){
        if (amount > balance) {
            System.out.println("Для перевода недостаточно средств.");
        }else{
            balance-=amount;
            other.balance += amount;
            System.out.println("Был осуществлен в перевод в размере: "+ amount+" рублей." +
                    " Перевод отправлен: "+ other.owner);
        }
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
}
