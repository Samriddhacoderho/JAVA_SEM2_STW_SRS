package week3_tasks_submission;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Namaste "+name);
        sc.close();
    }
}
