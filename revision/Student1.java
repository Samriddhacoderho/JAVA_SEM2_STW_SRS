package revision;

public class Student1 {
    private int id;
    private String name;
    private double marks;

    public int getID() {
        return this.id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return this.marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void calcMarks() {
        if(this.getMarks()>100 || this.getMarks()<0)
        {
            System.out.println("Please enter a valid marks");
        }
        else if(this.getMarks()>80 && this.getMarks()<=100)
        {
            System.out.println("A");
        }
        else if(this.getMarks()>60 && this.getMarks()<=79)
        {
            System.out.println("B");
        }
        else if(this.getMarks()>40 && this.getMarks()<=59)
        {
            System.out.println("C");
        }
        else
        {
            System.out.println("F");
        }
    }
}

class Main
{
    public static void main(String[] args) {
        Student1 s1=new Student1();
        s1.setID(1);
        s1.setName("Samriddha Raj Satyal");
        s1.setMarks(-3);
        s1.calcMarks();
    }
}
