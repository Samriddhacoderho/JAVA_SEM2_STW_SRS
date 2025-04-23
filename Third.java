import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number's factorial you want to find out:");
        int num=sc.nextInt();
        System.out.println(func_this(num));
        sc.close();
    }

    public static int func_this(int num)
    {
        int product=1;
        for(int i=1;i<=num;i++)
        {
            product*=i;
        }
        return product;
    }
}