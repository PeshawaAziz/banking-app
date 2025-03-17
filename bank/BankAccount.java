package bank;

public abstract class BankAccount {
    final private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public abstract void calculateInterest();

    public void deposit(double amount) {
        if (amount >= 0)
            balance += amount;
        else
            System.out.println("The amount to be deposited cannot be negative!");
    }

    public void withdraw(double amount) {
        if (amount >= 0)
            if (balance >= amount)
                balance -= amount;
            else
                System.out.println("Not enough balance!");
        else
            System.out.println("The amount to be withdrawn cannot be negative!");
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }
}
