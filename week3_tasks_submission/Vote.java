package week3_tasks_submission;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }
        sc.close();
    }

}
