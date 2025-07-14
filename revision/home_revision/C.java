package revision.home_revision;

class ExampleConstruct{
    private int x;
    
    public ExampleConstruct(int x){
        this.x=x;
    }
    
    public ExampleConstruct(ExampleConstruct obj){
        this.x=obj.x;
    }
    
    public int getX(){
        return this.x;
    }
}

public class C{
    public static void main(String[] args){
    ExampleConstruct obj1=new ExampleConstruct(2);
    ExampleConstruct obj2=new ExampleConstruct(obj1);
    System.out.println(obj1.getX()+","+obj2.getX());
}
}
