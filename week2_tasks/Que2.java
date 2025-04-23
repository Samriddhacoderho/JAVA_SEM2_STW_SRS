//2. Write a program to calculate Simple Interest. 


package week2_tasks;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principle, time, rate:");   
        double principle_amount=sc.nextDouble();
        int time=sc.nextInt();
        double rate=sc.nextDouble();
        System.out.println("The simple interest is:"+((principle_amount*time*rate)/100));  
        sc.close();
    }
}
