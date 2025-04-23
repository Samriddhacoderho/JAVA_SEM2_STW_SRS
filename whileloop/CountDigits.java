package whileloop;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        String num=sc.next();
        int i=0;
        int count=0;
        while(i<num.length())
        {
            if(!Character.isDigit(i))
            {
                System.out.println("Please enter number only");
                count=0;
                break;
            }
            else
            {
                count++;
            }
            i++;
        }
        if(count>0)
        {
            System.out.println("Number of digits:"+count);
        }
        sc.close();
    }
}
