package org.dexter;

import org.dexter.singleResponsibility.Account;
import org.dexter.singleResponsibility.AccountOperations;
import org.dexter.singleResponsibility.TransactionOperations;

import java.math.BigDecimal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNumber(23456);
        account.setFirstName("Sulaimon");
        account.setTotalAmount(BigDecimal.valueOf(30000));

        AccountOperations accountOperations = new AccountOperations();
        accountOperations.addAccount(account);
        TransactionOperations  transactionOperations = new TransactionOperations();
        transactionOperations.deposit(BigDecimal.valueOf(10000),23456);
        System.out.println(account.getTotalAmount());

    }
}