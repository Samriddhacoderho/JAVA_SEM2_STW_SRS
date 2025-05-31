package oop_tasks_31May.student_info_sys;

public class Main {
    public static void main(String[] args) {
        Student student=new Student(3.77);
        student.setID(240488);
        student.setName("Samriddha Raj Satyal");
        System.out.println("Name:"+student.getName());
        System.out.println("ID:"+student.getID());
        System.out.println("GPA:"+student.getGPA());
    }
}
