package arrays_all.tasks;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //1. Write a Java program to calculate the average value of array element.

        int[] arr=new int[5];
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter a number as an array element:");
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }

        System.out.println("The average is:"+(sum/arr.length));
        sc.close();
    }
}
