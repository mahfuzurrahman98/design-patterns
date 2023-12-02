package facade;

import java.math.BigDecimal;

public class Customer {
    public static void run() {
        BankService myBankService = new BankService();
        int mySaving = myBankService.createNewAccount("saving", new BigDecimal(500.00));
        int myInvestment = myBankService.createNewAccount("investment", new BigDecimal(1000.00));
        int myChequing = myBankService.createNewAccount("chequing", new BigDecimal(2000.00));

        if (mySaving != -1 && myInvestment != -1) {
            myBankService.transferMoney(mySaving, myInvestment, new BigDecimal(300.00));
        }

        if (mySaving != -1 && myChequing != -1) {
            myBankService.transferMoney(mySaving, myChequing, new BigDecimal(300.00));
        }
    }
}
