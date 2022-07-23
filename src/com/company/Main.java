package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<IAccount> Account = new ArrayList<IAccount>();
        Account.add(new BasicAccount(1, 100));
        Account.add(new StandardAccount(2, -100));
        Account.add(new PremiumAccount(3));

        for (IAccount account : Account) {
            account.Deposit(100);
            System.out.println("To withdraw 500, " + account.GetAccountNumber() + " can only  withdraw " + account.Withdraw(500));

        }
    }
}

