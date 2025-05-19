package oop.oop3;

public class ConstructorsJava {
    int num;

    ConstructorsJava()
    {
        System.out.println("Non Parameterized constructor");
    }

    ConstructorsJava(int a)
    {
        this.num=a;
    }

    ConstructorsJava(int a,int b)
    {
        int sum=a+b;
        this.num=sum;
    }

    ConstructorsJava(String val)
    {
        System.out.println("New parameterized with "+val);
    }

    ConstructorsJava(ConstructorsJava obj)
    {
        this.num=obj.num;
    }

    void setNum(int num)
    {
        this.num=num;
    }

    public int getNum()
    {
        return this.num;
    }
}
