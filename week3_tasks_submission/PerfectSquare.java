package week3_tasks_submission;

import java.util.Scanner;

public class PerfectSquare {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean found=false;
        for(int i=1;i<=num/2;i++)
        {
            if(i*i==num)
            {
                System.out.println("Perfect Square");
                found=true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("Not a perfect square");
        }
        sc.close();
    }
}