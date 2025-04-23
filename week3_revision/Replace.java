package week3_revision;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        sentence=sentence.toLowerCase();
        String newSentence="";
        for(int i=0;i<sentence.length();i++)
        {
            if(sentence.charAt(i)=='a' || sentence.charAt(i)=='e' || sentence.charAt(i)=='i' || sentence.charAt(i)=='o' || sentence.charAt(i)=='u' )
            {
                newSentence=newSentence+"*";   
            }
            else
            {
                newSentence=newSentence+sentence.charAt(i);
            }
        }
        System.out.println(newSentence);
        sc.close();
    }
}
