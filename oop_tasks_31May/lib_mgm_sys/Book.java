package oop_tasks_31May.lib_mgm_sys;

public class Book {
    private String bookTitle;
    private String authorName;
    private int pubYear;
    private boolean available=true;

    public String getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public int getPubYear() {
        return pubYear;
    }
    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    public String borrow()
    {
        if(!available)
        {
            available=true;
            return "You have borrowed the book";
        }
        else
        {
            return "This book is not available at the moment.";
        }
    }
    
}
