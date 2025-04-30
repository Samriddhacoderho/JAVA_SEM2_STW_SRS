package week5;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        func_tasks(n);
        sc.close();
    }

    public static void func_tasks(int n)
    {
        System.out.println("The odd numbers from 1 to "+n+"are:");
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
}
