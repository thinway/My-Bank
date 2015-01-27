package org.thinway.android.mybank;

/**
 * Created by thinway on 26/1/15.
 */
public class BankAccount {
    private double aBalance;
    public static final double OVERDRAFT_FEE = 30;

    public double getBalance() {
        return aBalance;
    }

    public void withdraw(double amount){
        aBalance -= amount;
    }

    public void deposit(double amount){
        aBalance += amount;
    }
}
