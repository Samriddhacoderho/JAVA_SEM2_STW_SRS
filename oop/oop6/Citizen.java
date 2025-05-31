package oop.oop6;

public class Citizen {
    private String name;
    private String citizenNumber;
    private int age;

    public Citizen(String name, String citizenNumber, int age) {
        this.name = name;
        this.citizenNumber = citizenNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCitizenNumber() {
        return citizenNumber;
    }

    public void setCitizenNumber(String citizenNumber) {
        this.citizenNumber = citizenNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    

    

}
