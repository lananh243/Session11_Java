package Bai9;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
        System.out.println("Rút tiền thành công. Số dư hiện tại: " + getBalance());
    }
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("Nạp tiền thành công. Số dư hiện tại: " + getBalance());
        }else {
            System.err.println("Số tiền nạp phải lớn hơn 0.");
        }

    }

    @Override
    public void displayBalance() {
        System.out.println("Số dư tài khoản vãng lai: "+getBalance());
    }
}
