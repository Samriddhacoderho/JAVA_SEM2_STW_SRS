package week5;

import java.util.Scanner;

public class PalindromePrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        func_palprime(num);
        sc.close();
    }

    public static void func_palprime(int num)
    {
        boolean ans=false;
        int s=0;
        int temp=num;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                ans=true;
                break;
            }
        }
        if(!ans)
        {
            while (num!=0) {
                s=(s*10)+(num%10);
                num=num/10;                
            }
            if(s==temp)
            {
                System.out.println("Palindrome prime number");
            }
            else
            {
                System.out.println("Not Palindrome prime number");
            }
        }
        else
        {
            System.out.println("Not Palindrome prime number");
        }
    }
}
