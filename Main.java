import bank.*;

public class Main {
    public static void main(String[] args) {
        BankCustomers bank = new BankCustomers();

        TransactionAccount transactionAccount1 = new TransactionAccount("937482", "Diako M.", 9182);
        TransactionAccount transactionAccount2 = new TransactionAccount("736482", "Frewertish M.", 784);
        TransactionAccount transactionAccount3 = new TransactionAccount("863718", "Keykhosrow M.", 9637);

        SavingsAccount savingsAccount1 = new SavingsAccount("768362", "Azhdahak M.", 832);
        SavingsAccount savingsAccount2 = new SavingsAccount("979854", "Ardashir S.", 3829);
        SavingsAccount savingsAccount3 = new SavingsAccount("545413", "Anushirwan S.", 9283);

        bank.addAccount(transactionAccount1);
        bank.addAccount(transactionAccount2);
        bank.addAccount(transactionAccount3);
        bank.addAccount(savingsAccount1);
        bank.addAccount(savingsAccount2);
        bank.addAccount(savingsAccount3);

        bank.findAccount("979854");
        bank.findAccount("646473");

        System.out.println(transactionAccount1.getBalance());
        transactionAccount1.deposit(232);
        System.out.println(transactionAccount1.getBalance());

        savingsAccount3.deposit(-238);

        transactionAccount2.calculateInterest();
        savingsAccount2.calculateInterest();

        System.out.println(transactionAccount2.getBalance());
        System.out.println(savingsAccount2.getBalance());

        transactionAccount1.withdraw(1939429);
        transactionAccount2.withdraw(-183);
        transactionAccount3.withdraw(19);

        savingsAccount1.withdraw(3);
        savingsAccount2.withdraw(-23);
        savingsAccount3.withdraw(283918);

        bank.showAllBalances();
    }
}
