package week5;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any sentence:");
        String word=sc.nextLine();
        func_count(word);
        sc.close();
    }

    public static void func_count(String word)
    {
        System.out.println(word.split(" ").length);
    }
}
