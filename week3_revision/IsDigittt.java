package week3_revision;

import java.util.Scanner;

public class IsDigittt {
    public static void main(String[] args) {
        boolean ok=false;
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        for(int i=0;i<word.length();i++)
        {
            if(!Character.isDigit(word.charAt(i)))
            {
                ok=true;
                break;
            }
        }
        if(ok)
        {
            System.out.println("Not All Digits");
        }
        else
        {
            System.out.println("All Digits");
        }
        sc.close();
    }
}
