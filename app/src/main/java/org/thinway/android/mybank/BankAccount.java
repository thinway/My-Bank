package org.thinway.android.mybank;

import java.util.ArrayList;

/**
 * Created by thinway on 26/1/15.
 */
public class BankAccount {
    public static final double OVERDRAFT_FEE = 30;
    public static final String TAG = "Bank Account";

    private ArrayList<Double> mTransactions;

    BankAccount(){
        mTransactions = new ArrayList<Double>();
    }

    public double getBalance() {
        double total = 0.0;

        for (int i = 0; i < mTransactions.size(); i++){
            total += mTransactions.get(i);
        }

        return total;
    }

    public void withdraw(double amount){
        mTransactions.add(-amount);

        if (this.getBalance() < 0) {
            mTransactions.add(-OVERDRAFT_FEE);
        }
    }

    public void deposit(double amount){
        mTransactions.add(amount);
    }
}
