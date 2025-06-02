package oop_CW_2June.bank_mgm_sys;

public class SavingsAccount extends BankAccount {

    SavingsAccount(int accNumber) {
        super(accNumber);
    }

    private double interestRate;

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double intRate) {
        this.interestRate = intRate;
    }

    public void calcInterest()
    {
        double interest=super.getBalance()*this.interestRate;
        System.out.println(interest);
    }
}
