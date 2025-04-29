package methods;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Factorial f1=new Factorial();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        System.out.println("The factorial of:"+num+" is: "+f1.func_fact(num));
        sc.close();
    }

    public int func_fact(int num)
    {
        int pro=1;
        for(int i=1;i<=num;i++)
        {
            pro=pro*i;
        }
        return pro;
    }
}
