package com.company;

public class PremiumAccount implements IAccount{
    protected int accountNumber;
    protected double currentBalance;

    public PremiumAccount(int accountNumber) {
        this.accountNumber =accountNumber;
        currentBalance = 0;
    }

    @Override
    public void Deposit(double amount) {
        currentBalance +=amount;

    }

    @Override
    public double Withdraw(double amount) {
        currentBalance -=amount;
        return amount;
    }

    @Override
    public double GetCurrentBalance() {
        // TODO Auto-generated method stub
        return currentBalance;
    }

    @Override
    public int GetAccountNumber() {
        // TODO Auto-generated method stub
        return accountNumber;
    }
}