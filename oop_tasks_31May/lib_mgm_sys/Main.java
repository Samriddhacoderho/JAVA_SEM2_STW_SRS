package oop_tasks_31May.lib_mgm_sys;

public class Main {
    public static void main(String[] args) {
        Book book=new Book();
        book.setAuthorName("Samriddha");
        book.setBookTitle("JAVA OOP Best book");
        book.setPubYear(2020);
        System.out.println(book.borrow());
    }
}
