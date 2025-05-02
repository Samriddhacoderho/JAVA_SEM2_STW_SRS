package week5;

import java.util.Scanner;

public class SumSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(func_tasks(n));
        sc.close();
    }

    public static int func_tasks(int n) {
        int s = 0;
        while (n != 0) {
            s = s + (n % 10) * (n % 10);
            n = n / 10;
        }
        return s;
    }
}
