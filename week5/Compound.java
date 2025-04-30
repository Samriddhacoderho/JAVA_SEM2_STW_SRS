package week5;

public class Compound {
    public static void main(String[] args) {
        double principle=3640.34,rate=3.4,time=2;
        System.out.println(func_compound(principle,rate,time));
    }

    public static double func_compound(double p,double r,double t)
    {
        double ci=(p*(Math.pow((1+(r/12)), (12*t))))-p;
        return ci;
    }
}
