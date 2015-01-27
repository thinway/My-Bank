package org.thinway.android.mybank;

/**
 * Created by thinway on 26/1/15.
 */
public class BankAccount {
    public static final double OVERDRAFT_FEE = 30;
    public static final String TAG = "Bank Account";

    private double aBalance;

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
