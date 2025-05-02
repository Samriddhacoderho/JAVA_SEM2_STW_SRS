package week5;

import java.util.Scanner;

public class AllFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func_tasks(n);
        sc.close();
    }

    public static void func_tasks(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }
    }
}
