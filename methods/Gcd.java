package methods;

public class Gcd {
    public static void main(String[] args) {
        func_gcd(61, 44);
    }

    public static void func_gcd(int num1, int num2) {
        int gcd = 1;
        int temp = 0;
        if (num1 > num2) {  //12 44
            temp=num1;  //temp=12
            num1=num2;  //num1=44
            num2=temp; //num2=12
        }

        for(int i=2;i<=num1/2;i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                gcd=i;
            }
        }
        System.out.println("GCD is:"+gcd);
    }
}
