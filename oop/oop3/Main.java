package oop.oop3;

public class Main {
    public static void main(String[] args) {
        ConstructorsJava const1=new ConstructorsJava();
        System.out.println(const1.getNum());  //returns null

        ConstructorsJava const2=new ConstructorsJava(5);
        System.out.println(const2.getNum());


        ConstructorsJava const3=new ConstructorsJava(6);

        ConstructorsJava const4=new ConstructorsJava(const3);
    }
}
