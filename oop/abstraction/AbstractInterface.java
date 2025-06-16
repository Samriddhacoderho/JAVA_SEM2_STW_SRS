package oop.abstraction;

public interface AbstractInterface {
    //final attributes  -- constant
    // abstract methods matra huncha. uta abstract class ma chai normal methods ni banauna mithyo. thats why we said abstract class ma 0 to 100% abstraction huncha.
    //however interface ma bhako methods by default abstract huncha, normal hunna, so 100% abstraction received.

    //also, interface ma constructor hunna.

    int num = 10;

    void printLength();
}

 interface InnerAbstractInterface {
    void printVolume();
}

 class Good  implements AbstractInterface,InnerAbstractInterface{

    @Override
    public void printVolume() {
        System.out.println("Print volume");
        System.out.println(num);
    }

    @Override
    public void printLength() {
        System.out.println("Print Length");
    }
    
}

class Main{
    public static void main(String[] args) {
        Good good=new Good();
        good.printVolume();
        good.printLength();
    }
}
