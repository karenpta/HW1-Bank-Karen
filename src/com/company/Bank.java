package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank{
    public List<IAccount> Account;

    public Bank(){
        this.Account = new ArrayList<>();

    }

    @Override
    public void OpenAccount(IAccount account) {
        this.Account.add(account);
    }

    @Override
    public void CloseAccount(int accountNumber) {
        IAccount bal = null;
        for (IAccount x :  this.Account){
            if(x.GetAccountNumber() == accountNumber){
                if(x.GetCurrentBalance() >= 0){
                    bal = x;
                }else{
                    System.out.println("debt cannot close");
                }
            }
        }
        if(bal != null){
            this.Account.remove(bal);
        }

    }

    @Override
    public List<IAccount> GetAllAccounts() {
        return this.Account;
    }

    @Override
    public List<IAccount> GetAllAccountsInDebt() {
        List<IAccount> bal = new ArrayList<>();
        for(IAccount x : this.Account){
            if(x.GetCurrentBalance() < 0){
                bal.add(x);
            }
        }
        return bal;
    }

    @Override
    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        List<IAccount> bal = new ArrayList<>();
        for(IAccount x : this.Account){
            if(x.GetCurrentBalance() > balanceAbove){
                bal.add(x);
            }
        }
        return bal;

    }


}