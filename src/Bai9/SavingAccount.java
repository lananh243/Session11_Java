package Bai9;

public class SavingAccount extends BankAccount{
    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Rút tiền từ tài khoản tiết kiệm thành công. Số dư hiện tại: " + getBalance());
        }else {
            System.err.println("Tài khoản tiết kiệm sẽ không cho phép rút vượt quá số dư");
        }
    }
    @Override
    public void deposit(double amount){
        setBalance(getBalance() + amount);
        System.out.println("Nạp tiền vào tài khoản tiết kiệm thành công. Số dư hiện tại: "+getBalance());
    }

    @Override
    public void displayBalance() {
        System.out.println("Số dư tài khoản tiết kiệm: "+getBalance());
    }
}
