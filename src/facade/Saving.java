package facade;

import java.math.BigDecimal;

public class Saving implements IAccount {
  private int accountNumber;
  private BigDecimal balance;

  public Saving(BigDecimal initialAmount) {
    // Implementation details for Saving account creation
    this.accountNumber = generateAccountNumber();
    this.balance = initialAmount;
    System.out.println("Saving account created, [acc_no: " + accountNumber + ", balance: " + initialAmount + "]");
  }

  @Override
  public void deposit(BigDecimal amount) {
    // Implementation details for deposit in Saving account
    balance = balance.add(amount);
    System.out.println("Deposited from Saving account, [acc_no : " + accountNumber + ", balance : " + balance + "]");
  }

  @Override
  public void withdraw(BigDecimal amount) {
    // Implementation details for withdrawal from Saving account
    if (balance.compareTo(amount) >= 0) {
      balance = balance.subtract(amount);
      System.out.println("Withdrawn " + amount + " from Saving account. New balance: " + balance);
    } else {
      System.out.println("Insufficient funds in Saving account");
    }
  }

  @Override
  public void transfer(IAccount toAccount, BigDecimal amount) {
    // Implementation details for transfer from Saving account
    if (balance.compareTo(amount) >= 0) {
      withdraw(amount);
      toAccount.deposit(amount);
      String toAccType = toAccount.getClass().getSimpleName();
      System.out.println("Transferred from Saving account to " + toAccType + " account, [from_acc_no : "
          + accountNumber + ", to_acc_no : " + toAccount.getAccountNumber() + ", amount : " + amount + "]");
    } else {
      System.out.println("Insufficient funds in Saving account for transfer");
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
