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
        IAccount temp = null;
        for (IAccount x :  this.Account){
            if(x.GetAccountNumber() == accountNumber){
                if(x.GetCurrentBalance() >= 0){
                    temp = x;
                }else{
                    System.out.println("this account cannot be closed due to debt");
                }
            }
        }
        if(temp != null){
            this.Account.remove(temp);
        }

    }

    @Override
    public List<IAccount> GetAllAccounts() {
        return this.Account;
    }

    @Override
    public List<IAccount> GetAllAccountsInDebt() {
        List<IAccount> temp = new ArrayList<>();
        for(IAccount x : this.Account){
            if(x.GetCurrentBalance() < 0){
                temp.add(x);
            }
        }
        return temp;
    }

    @Override
    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        List<IAccount> temp = new ArrayList<>();
        for(IAccount x : this.Account){
            if(x.GetCurrentBalance() > balanceAbove){
                temp.add(x);
            }
        }
        return temp;

    }


}