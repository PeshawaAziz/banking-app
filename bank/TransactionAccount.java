package bank;

public class TransactionAccount extends BankAccount {
    private final double overDraftLimit = 500;

    public TransactionAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("There is no interest for this account. [Transaction account]");
    }

    @Override
    public void withdraw(double amount) {
        if (amount >= 0)
            if (balance + overDraftLimit >= amount)
                balance -= amount;
            else
                System.out.println("Reached overdraft limit!");
        else
            System.out.println("The amount to be withdrawn cannot be negative!");
    }

}
