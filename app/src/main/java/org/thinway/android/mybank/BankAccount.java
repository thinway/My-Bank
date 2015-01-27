package org.thinway.android.mybank;

/**
 * Created by thinway on 26/1/15.
 */
public class BankAccount {
    public static final double OVERDRAFT_FEE = 30;
    public static final String TAG = "Bank Account";

    private double mBalance;

    public double getBalance() {
        return mBalance;
    }

    public void withdraw(double amount){
        mBalance -= amount;

        if (mBalance < 0) {
            mBalance -= OVERDRAFT_FEE;
        }
    }

    public void deposit(double amount){
        mBalance += amount;
    }
}
