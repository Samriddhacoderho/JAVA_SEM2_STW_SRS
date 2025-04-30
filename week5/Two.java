package week5;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        func_task(days);
        sc.close();
    }

    public static void func_task(int days)
    {
        int year=days/365;  //396/365=1
        int rem_days_after_years=days%365;   //31
        int months=rem_days_after_years/30;  //1
        int rem_days_after_months=rem_days_after_years%30;  //1
        System.out.println("Equivalent to:"+"\nYears:"+year+"\nMonths:"+months+"\nDays:"+rem_days_after_months);
    }
}
