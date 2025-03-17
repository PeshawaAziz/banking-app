package bank;

import java.util.ArrayList;

public class BankCustomers {
    private ArrayList<BankAccount> accountsList;

    public void addAccount(BankAccount account) {
        accountsList.add(account);
    }

    public void showAllBalances() {
        for (BankAccount account : accountsList) {
            System.out.println(account.getAccountHolderName() + " [" + account.getAccountNumber() + "] => Balance: "
                    + account.balance + "$");
        }
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accountsList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println(account.getAccountHolderName() + " [" + account.getAccountNumber() + "]");
                return account;
            }
        }

        System.out.println("No account was found.");
        return null;
    }
}
