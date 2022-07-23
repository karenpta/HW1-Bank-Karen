package com.company;

public class StandardAccount implements IAccount {
    private double currentBalance;
    protected int accountNumber;
    protected double creditLimit;

    public StandardAccount(int acountNumber , double creditLimit) {
        this.accountNumber = accountNumber;
        if (creditLimit>0) {
            creditLimit=0;
        }
        this.creditLimit = creditLimit;
        currentBalance = 0;
    }

    @Override
    public void Deposit(double amount) {
        currentBalance += amount;

    }

    @Override
    public double Withdraw(double amount) {
        if (currentBalance - amount < creditLimit && currentBalance != creditLimit ) {
            double temp =  currentBalance +(-creditLimit);
            currentBalance -= temp;
            return temp;
        }
        else if (currentBalance == creditLimit) {
            return 0;
        }
        else
        {
            currentBalance -= amount;
            return amount;
        }
    }

    @Override
    public double GetCurrentBalance() {
        return currentBalance;
    }

    @Override
    public int GetAccountNumber() {
        // TODO Auto-generated method stub
        return accountNumber;
    }
}