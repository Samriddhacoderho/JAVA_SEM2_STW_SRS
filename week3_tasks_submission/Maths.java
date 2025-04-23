package week3_tasks_submission;

import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Sum is:"+(num1+num2));
        System.out.println("Difference is:"+(num1-num2));
        System.out.println("Product is:"+(num1*num2));
        System.out.println("Division is:"+(num1/num2));
        sc.close();
    }
}
