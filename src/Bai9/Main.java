package Bai9;

public class Main {
    public static void main(String[] args) {
        Bank bankAccount = new Bank();
        BankAccount savingAcc = new SavingAccount("09555687788",1000);
        BankAccount checkingAcc = new CheckingAccount("07654434567", 2000);
        bankAccount.addAccount(savingAcc);
        savingAcc.withdraw(500);
        savingAcc.deposit(400);
        savingAcc.displayBalance();
        System.out.println("----------------------------");
        bankAccount.addAccount(checkingAcc);
        checkingAcc.withdraw(2200);
        checkingAcc.deposit(600);
        checkingAcc.displayBalance();
    }
}
