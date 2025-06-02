package oop_CW_2June.emp_mgm_sys;

public class Employee extends Person {
    private int employeeID;

    Employee(String name,String address,int employeeID)
    {
        super(name,address);
        this.employeeID=employeeID;
    }

    public void displayEmployeeDetails(int employeeID) {
        if (this.employeeID == employeeID) {
            System.out.println("Employee Details are below:");
            System.out.println("Name:"+super.getName());
            System.out.println("Addrss:"+super.getAddress());
            System.out.println("Employee ID:"+this.employeeID);
        }
        else
        {
            System.out.println("Unauthorized access");
        }
    }
}
