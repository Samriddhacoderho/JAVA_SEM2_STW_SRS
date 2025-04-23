package week3_revision;

import java.util.Scanner;

public class CountUCLC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        int upper=0;
        int lower=0;
        for(int i=0;i<word.length();i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
            {
                upper+=1;
            }
            else if(Character.isLowerCase(word.charAt(i)))
            {
                lower+=1;
            }
            else
            {
                continue;
            }
        }
        System.out.println("Uppercase characters:"+upper);
        System.out.println("Lowercase characters:"+lower);
        sc.close();
    }
}
