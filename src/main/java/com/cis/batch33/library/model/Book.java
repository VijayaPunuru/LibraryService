package com.cis.batch33.library.model;

public class Book {

    private int bookid;
    private String title;
    private String authorname;
    private int yearpublished;
    private int quantity;

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public int getYearpublished() {
        return yearpublished;
    }

    public void setYearpublished(int yearpublished) {
        this.yearpublished = yearpublished;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

