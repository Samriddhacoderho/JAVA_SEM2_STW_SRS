//4. Write the ternary operator for question no. 1

package week2_tasks;

import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        System.out.println((age>18)?"Eligible to vote":"Not eligible to vote");
        sc.close();
    }
}
