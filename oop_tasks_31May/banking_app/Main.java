package oop_tasks_31May.banking_app;

public class Main {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        b1.withdraw(12345, 100);  //allowed  -- 900
        b1.withdraw(12345, 100);  //allowed  -- 800
        b1.deposit(1234, 100);  //not allowed  --800
        b1.deposit(12345, 100);  //allowed  --900
        b1.checkBalance(123);  //not allowed 
        b1.checkBalance(12345);
    }
}
