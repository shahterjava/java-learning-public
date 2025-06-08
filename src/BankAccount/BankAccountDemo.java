package BankAccount;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Дмитрий", 1000);
        bankAccount.deposit(500);
        bankAccount.withdraw(200);
        bankAccount.showInfo();
    }
}
