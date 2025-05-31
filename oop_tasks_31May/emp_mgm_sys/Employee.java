package oop_tasks_31May.emp_mgm_sys;

public class Employee {
    private String name;
    private String id;
    private double salary;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(String i) {
        id = i;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void updateSalary(double change) {
        if (salary + change >= 0) {
            salary = salary + change;
        }
    }
}


