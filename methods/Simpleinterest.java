// 5. Write a program for calculating Simple Interest using a method and print the result from the method itself.


package methods;

public class Simpleinterest {
    public static void main(String[] args) {
        double principle=1000.5;
        double rate=4.5;
        int time=2;
        func_si(principle,rate,time);
    }

    public static void func_si(double principle,double rate,int time)
    {
        System.out.println("The simple interest is:"+((principle*time*rate)/100));
    }
}

