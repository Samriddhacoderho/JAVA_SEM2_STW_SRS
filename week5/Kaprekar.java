package week5;

import java.util.Scanner;

public class Kaprekar {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    func_tasks(num);
    sc.close();
   }

   public static void func_tasks(int num)
   {
    String squareNum=Integer.toString(num*num);
    int len=squareNum.length()/2;
    String left=squareNum.substring(0, len),right=squareNum.substring(len);
    if(Integer.valueOf(left)+Integer.valueOf(right)==num)
    {
        System.out.println("Kaprekar number");
    }
    else
    {
        System.out.println("Not Kaprekar number");
    }
}
}
