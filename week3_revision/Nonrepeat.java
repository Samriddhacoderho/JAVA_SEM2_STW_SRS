package week3_revision;

import java.util.Scanner;

public class Nonrepeat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        str=str.toLowerCase();
        char userNep=' ';
        // 
        for(int i=0;i<str.length()-1;i++)
        {
            userNep=str.charAt(i);
            for(int j=i+1;j<str.length();j++)
            {
                if(userNep==str.charAt(j))
                {
                    userNep=' ';
                }
            }
            if(userNep!=' ')
            {
                break;
            }
        }
        System.out.println(userNep);
        sc.close();
    }
}
