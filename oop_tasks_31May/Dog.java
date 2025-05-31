package oop_tasks_31May;

class Dog {
    String name;
    String breed;

    Dog(String n, String b) {
        name = n;
        breed = b;
    }

    void setName(String n) {
        name = n;
    }

    void setBreed(String b) {
        breed = b;
    }

    String getName() {
        return name;
    }

    String getBreed() {
        return breed;
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Elvis", "GSD");
        Dog d2 = new Dog("Bryan", "Japanese Spitz");

        d1.setName("Rambo");
        d1.setBreed("Labrador");

        d2.setName("Mingu");
        d2.setBreed("Golden Retriever");

        System.out.println(d1.getName());
        System.out.println(d1.getBreed());

        System.out.println(d2.getName());
        System.out.println(d2.getBreed());
    }
}
