package org.thinway.android.mybank;

/**
 * Created by thinway on 26/1/15.
 */
public class BankAccount {
    private double balance;
    public static final double overdraftFee = 30;

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public void deposit(double amount){
        balance += amount;
    }
}
