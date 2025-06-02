package oop_CW_2June.emp_mgm_sys;

public class Person {
    private String name;
    private String address;

    Person(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    
}
