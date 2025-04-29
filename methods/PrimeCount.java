package methods;


public class PrimeCount {
    public static void main(String[] args) {
        int num = 11;
        func_primecount(num);
    }

    public static void func_primecount(int num) // 9
    {
        int count = 0;
        boolean ans = false;
        for (int i = 1; i < num; i++) // 5
        {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    ans = true;
                    break;
                }
            }
            if (ans == false) {
                System.out.print(i + ",");
                count++;
            }
            ans=false;
        }
        System.out.println("\nNumber of prime="+count);
    }
}
