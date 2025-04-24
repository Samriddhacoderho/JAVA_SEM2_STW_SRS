package week3_tasks_submission;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        boolean check=false;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                check=true;
                break;
            }
        }
        if(check)
        {
            System.out.println("Not prime");
        }
        else
        {
            System.out.println("Prime");
        }
        sc.close();
    }
    
}
