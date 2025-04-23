package week3_revision;

import java.util.Scanner;

public class NewWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        word=word.toLowerCase();
        String repeat=" ";
        //aaryan
        for(int i=0;i<word.length();i++)
        {
            repeat=" ";
            for(int j=i+1;j<word.length();j++)
            {
                if(word.charAt(i)==word.charAt(j))
                {
                    repeat=""+word.charAt(i);
                }
            }
            if(repeat!=" ")
            {
                word=word.replace(repeat, "");
            }
        }
        System.out.println(word);
        sc.close();
    }
}
