package oop_CW_2June.bank_mgm_sys;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount=new SavingsAccount(12345);
        savingsAccount.setBalance(1000,123);
        savingsAccount.setInterestRate(5);
        savingsAccount.calcInterest();
    }
}
