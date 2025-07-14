package revision.home_revision;

public class D {
    int length;
    public D(int length){
        this.length=length;
    }
}

class E extends D{
    int breadth;
    public E(int length,int breadth){
        super(length);
        this.breadth=breadth;
    }
    
}

class F extends E{
    int height;
    public F(int length,int breadth,int height){
        super(length, breadth);
        this.height=height;
    }
    
    public int calcFunc(){
        int vol=super.length*super.breadth*this.height;
        return vol;
    }
}

class Main{
    public static void main(String[] args) {
    F obj=new F(3,4 ,5);
    System.out.println(obj.calcFunc());        
    }
    
}
