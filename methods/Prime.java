package methods;

import java.util.Scanner;

public class Prime {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = sc.nextInt();
        Prime p1 = new Prime();
        p1.func_prime(num);
    }

    public void func_prime(int num) {
        boolean ans = false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                ans = true;
                break;
            }
        }
        if (ans == false) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }
}
