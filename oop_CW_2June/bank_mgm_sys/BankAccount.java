package oop_CW_2June.bank_mgm_sys;

public class BankAccount {
    private int accNumber;
    private double balance;

    BankAccount(int accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance, int accNum) {
        if (this.accNumber == accNum) {
            this.balance = balance;
        } else {
            System.out.println("Unauthorized access");
        }
    }

}
