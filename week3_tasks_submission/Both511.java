package week3_tasks_submission;

import java.util.Scanner;

public class Both511 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%5==0 && num%11==0)
        {
            System.out.println("Divisible by both");
        }
        else if(num%5==0)
        {
            System.out.println("Divisible by 5 only");
        }
        else if(num%11==0)
        {
            System.out.println("Divisible by 11 only");
        }
        else
        {
            System.out.println("Not divisble by any number");
        }
        sc.close();
    }
}
