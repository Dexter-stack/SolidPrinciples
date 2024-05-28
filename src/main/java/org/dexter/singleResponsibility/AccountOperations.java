package org.dexter.singleResponsibility;

import java.util.HashMap;
import java.util.Map;

public class AccountOperations {

    // following SOLID principles this class should have a single responsibility

    private static Map<Integer , Account> accountMap = new HashMap<>();

    public void addAccount(Account account){
        accountMap.put(account.getAccountNumber(),account);
    }

    public void updateAccount(Account account){
        accountMap.put(account.getAccountNumber(), account);
    }

    public Account getAccount(int accountNumber){
        return accountMap.get(accountNumber);
    }
}
