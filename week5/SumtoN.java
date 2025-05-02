package week5;

import java.util.Scanner;

public class SumtoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func_tasks(n);
        sc.close();
    }

    public static void func_tasks(int n) {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("Sum = " + sum);
    }
}

