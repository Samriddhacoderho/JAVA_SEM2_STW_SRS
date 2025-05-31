package oop_tasks_31May.emp_mgm_sys;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Samriddha");
        e.setId("240488");
        e.updateSalary(5000);

        System.out.println(e.getName());
        System.out.println(e.getId());
        System.out.println(e.getSalary());

        e.updateSalary(1500); 
        System.out.println(e.getSalary());

        e.updateSalary(-3000); 
        System.out.println(e.getSalary());

        e.updateSalary(-4000); 
        System.out.println(e.getSalary());
    }
}
