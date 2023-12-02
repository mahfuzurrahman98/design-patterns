package facade;

import java.math.BigDecimal;

public class Investment implements IAccount {
  private int accountNumber;
  private BigDecimal balance;

  public Investment(BigDecimal initialAmount) {
    // Implementation details for Investment account creation
    this.accountNumber = generateAccountNumber();
    this.balance = initialAmount;
    System.out.println("Investment account created, [acc_no : " + accountNumber + ", balance : " + initialAmount + "]");
  }

  @Override
  public void deposit(BigDecimal amount) {
    // Implementation details for deposit in Investment account
    balance = balance.add(amount);
    System.out.println("Deposited to Investment account, [acc_no : " + accountNumber + ", balance : " + balance + "]");
  }

  @Override
  public void withdraw(BigDecimal amount) {
    // Implementation details for withdrawal from Investment account
    // For simplicity, assume no withdrawal restrictions in this example
    if (balance.compareTo(amount) >= 0) {
      balance = balance.subtract(amount);
      System.out
          .println("Withdrawn from Investment account, [acc_no : " + accountNumber + ", balance : " + balance + "]");
    } else {
      System.out.println("Insufficient funds in Investment account");
    }
  }

  @Override
  public void transfer(IAccount toAccount, BigDecimal amount) {
    // Implementation details for transfer from Investment account
    if (balance.compareTo(amount) >= 0) {
      withdraw(amount);
      toAccount.deposit(amount);
      String toAccType = toAccount.getClass().getSimpleName();
      System.out.println("Transferred from Investment account to " + toAccType + " account, [from_acc_no : "
          + accountNumber + ", to_acc_no : " + toAccount.getAccountNumber() + ", amount : " + amount + "]");
    } else {
      System.out.println("Insufficient funds in Investment account for transfer");
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
