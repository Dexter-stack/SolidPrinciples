package org.dexter.singleResponsibility;

import java.math.BigDecimal;

public class TransactionOperations {

    public void deposit(BigDecimal amount , int accountNumber){
        //getting account details it is the workof account operations
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().add(amount));
    }


    public void withdraw(BigDecimal amount, int accountNumber){
        AccountOperations accountOperations = new AccountOperations();
        Account account =  accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().subtract(amount));
    }
}
