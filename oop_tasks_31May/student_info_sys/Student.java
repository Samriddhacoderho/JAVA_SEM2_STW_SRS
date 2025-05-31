package oop_tasks_31May.student_info_sys;

public class Student {
    private String name;
    private int ID;
    private double GPA;

    public Student(double GPA)
    {
        this.GPA=GPA;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public double getGPA() {
        return GPA;
    }

    
}
