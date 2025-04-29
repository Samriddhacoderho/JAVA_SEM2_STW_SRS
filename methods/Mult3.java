// 4. Write a program for multiplying 3 numbers using a method and return the result and print the result from the main method.

package methods;

public class Mult3 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        int num3 = 4;
        System.out.println(func_mult3(num1,num2,num3));
    }
    public static int func_mult3(int num1,int num2,int num3)
    {
        return num1*num2*num3;
    }
}
