package com.company;

public class BasicAccount implements IAccount {
    public double currentBalance;
    public int accountNumber;
    public double creditLimit;
    public double withdrawalLimit;

    public BasicAccount(int accountNumber, double withdrawalLimit) {
        this.currentBalance = 0;
        this.accountNumber = accountNumber;
        this.creditLimit = 0;
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void Deposit(double amount) {
        currentBalance += amount;
    }

    @Override
    public double Withdraw(double amount) {
        if (amount > withdrawalLimit) {
            currentBalance -= withdrawalLimit;
            return withdrawalLimit;
        } else {
            currentBalance -= amount;
            return amount;
        }
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