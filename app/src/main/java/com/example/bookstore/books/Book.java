package com.example.bookstore.books;

public class Book {
    private int pages;
    private String title;
    private String categores;

    public Book(int pages,String title,String categores) {
        this.pages = pages;
        this.title=title;
        this.categores=categores;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategores() {
        return categores;
    }

    public void setCategores(String categores) {
        this.categores = categores;
    }
}
