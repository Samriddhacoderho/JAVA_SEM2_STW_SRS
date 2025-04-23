//1. Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote.


package week2_tasks;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:"); 
        int user_age=sc.nextInt();
        if(user_age>18)
        {
            System.out.println("You are eligible to vote!");
        }       
        else
        {
            System.out.println("You are not eligible to vote!");
        }

        sc.close();
    }
}
