//5. Write a program to take two integer inputs from the user and print the sum and product of them.

package week2_tasks;

import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two integer numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Sum is:"+(a+b));
        System.out.println("Product is:"+(a*b));
        sc.close();
    }
}
