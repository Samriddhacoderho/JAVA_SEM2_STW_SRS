package week3_tasks_submission;

import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==0)
        {
            System.out.println("Zero number");
        }
        else if(num>0)
        {
            System.out.println("Positive number");
        }
        else
        {
            System.out.println("Negative number");
        }
        sc.close();
    }
}

