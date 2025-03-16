package Bai9;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    public List<BankAccount> banks = new ArrayList<>();

    public void addAccount(BankAccount bankAccount){
        banks.add(bankAccount);
    }

    public void displayBalance() {
        for (BankAccount bankAccount : banks) {
            bankAccount.displayBalance();
        }
    }
}
