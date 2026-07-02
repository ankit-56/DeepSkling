package com.test;

public class BankAccount {

    private String accountHolder;
    private int balance;

    public BankAccount(String accountHolder, int initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        if(amount > 0)
            balance += amount;
    }

    public void withdraw(int amount) {
        if(amount > 0 && amount <= balance)
            balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}