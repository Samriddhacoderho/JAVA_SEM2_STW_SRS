package oop_CW_2June.ebook_mgm_sys;

public class EBook extends Book{
    private int fileSize;
    private String format;

    public EBook(String title,String author,int fileSize,String format)
    {
        super(title, author);
        this.fileSize=fileSize;
        this.format=format;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void printDetailsofBook()
    {
        System.out.println("Here are the book details:\n");
        System.out.println("Title:"+super.getTitle());
        System.out.println("Author:"+super.getAuthor());
        System.out.println("File Size"+getFileSize());
        System.out.println("Format:"+getFormat());
    }
}
