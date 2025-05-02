package week5;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        func_tasks(a, b);
        sc.close();
    }

    public static void func_tasks(int a, int b) {
        int t = a;
        a = b;
        b = t;
        System.out.println("a = " + a + " b = " + b);
    }
}
