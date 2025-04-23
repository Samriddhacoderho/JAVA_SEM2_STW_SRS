package week3_revision;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        sentence=sentence.toLowerCase();
        String[] arr=sentence.split(" ");
        int frequency=1;
        //['Sam','Sam','is','Sam']
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i].equals(arr[j]))
                {
                    frequency+=1;
                }
            }   
            System.out.println("Frequency of word:"+arr[i]+"="+frequency);
            frequency=0;
        }
        sc.close();
    }
}
