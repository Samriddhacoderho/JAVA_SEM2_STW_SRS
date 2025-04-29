package methods;

import java.util.Scanner;

public class NthFib {
    public static void main(String[] args) {
        NthFib n1=new NthFib();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth number for which you want the fibonacci number:");
        int n=sc.nextInt();
        System.out.println("The fibonacci number is:"+n1.func_fib(n));
        sc.close();
    }

    public int func_fib(int n)
    {
        int a=0;
        int b=1;
        int c=0;
        for(int i=1;i<=n-2;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}
