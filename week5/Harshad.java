package week5;

import java.util.Scanner;

public class Harshad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=sc.nextInt();
        func_harshad(num);
        sc.close();
    }

    public static void func_harshad(int num)
    {
        int temp=num;
        int sum=0;
        while (num!=0) {
            sum=sum+(num%10);
            num=num/10;
        }
        if(temp%sum==0)
        {
            System.out.println("Harshad Number");
        }
        else
        {
            System.out.println("Not a Harshad Number");
        }
    }
}
