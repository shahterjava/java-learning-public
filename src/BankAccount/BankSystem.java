package BankAccount;

import java.util.ArrayList;
import java.util.List;

public class BankSystem {
    List<BankAccount> accounts = new ArrayList<>();
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



}
