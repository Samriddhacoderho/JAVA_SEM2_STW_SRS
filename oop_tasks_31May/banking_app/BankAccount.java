package oop_tasks_31May.banking_app;

public class BankAccount {
    private int accNum = 12345;
    private String accHolderName = "Samriddha";
    private double accBalance = 1000;

    public void deposit(int accNum, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Amount");
        } else {
            if (this.accNum != accNum) {
                System.out.println("Unauthorized access");
            } else {
                this.accBalance = this.accBalance + amount;
                System.out.println("Your new balance is:" + this.accBalance);
            }
        }
    }

    public void withdraw(int accNum, double amount) {
        if (amount <= 0 || amount > this.accBalance) {
            System.out.println("Invalid Amount");
        } else {
            if (this.accNum != accNum) {
                System.out.println("Unauthorized access");
            } else {
                this.accBalance = this.accBalance - amount;
                System.out.println("Your new balance is:" + this.accBalance);
            }
        }
    }

    public void checkBalance(int accNum) {

        if (this.accNum != accNum) {
            System.out.println("Unauthorized access");
        } else {
            System.out.println("Your current balance is:" + this.accBalance);
        }

    }

}
