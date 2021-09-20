/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Norwin Schäfer
 * @version 13.09.2021
 */
class Book {
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pages) {
        this.author = bookAuthor;
        this.title = bookTitle;
        this.pages = pages;
        this.refNumber = "";
        this.borrowed = 0;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public int getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(int borrowed) {
        this.borrowed = borrowed;
    }

    public void borrow() {
        borrowed++;
    }

    public void printAuthor() {
        System.out.println(author);
    }

    public void printTitle() {
        System.out.println(title);
    }

    public void printDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Ref Number: " + refNumber);
    }
}
