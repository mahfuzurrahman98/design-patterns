package facade;

import java.math.BigDecimal;

public class Chequing implements IAccount {
    private int accountNumber;
    private BigDecimal balance;

    public Chequing(BigDecimal initialAmount) {
        // Implementation details for Chequing account creation
        this.accountNumber = generateAccountNumber();
        this.balance = initialAmount;
        System.out.println("Chequing account created, [acc_no: " + accountNumber + ", balance: " + initialAmount + "]");
    }

    @Override
    public void deposit(BigDecimal amount) {
        // Implementation details for deposit in Chequing account
        balance = balance.add(amount);
        System.out.println(
                "Deposited from Chequing account, [acc_no : " + accountNumber + ", balance : " + balance + "]");
    }

    @Override
    public void withdraw(BigDecimal amount) {
        // Implementation details for withdrawal from Chequing account
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
            System.out.println(
                    "Withdrawn from Chequing account, [acc_no : " + accountNumber + ", balance : " + balance + "]");
        } else {
            System.out.println("Insufficient funds in Chequing account");
        }
    }

    @Override
    public void transfer(IAccount toAccount, BigDecimal amount) {
        // Implementation details for transfer from Chequing account
        if (balance.compareTo(amount) >= 0) {
            withdraw(amount);
            toAccount.deposit(amount);
            String toAccType = toAccount.getClass().getSimpleName();
            System.out.println("Transferred from Chequing account to " + toAccType + " account, [from_acc_no : "
                    + accountNumber + ", to_acc_no : " + toAccount.getAccountNumber() + ", amount : " + amount + "]");
        } else {
            System.out.println("Insufficient funds in Chequing account for transfer");
        }
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    // Placeholder method to generate a unique account number (replace with your
    // logic)
    private int generateAccountNumber() {
        return (int) (Math.random() * 100000);
    }
}
