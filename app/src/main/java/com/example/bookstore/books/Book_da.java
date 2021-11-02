package com.example.bookstore.books;

import java.util.ArrayList;
import java.util.List;

public class Book_da implements Ibooks {
    ArrayList<Book> books=new ArrayList<>();

    public Book_da(){
        books.add(new Book(500,"learn java","java"));
        books.add(new Book(600,"learn python","python"));
        books.add(new Book(700,"learn c","c"));
        books.add(new Book(550,"learn java more","java"));
    }
//method to get list of books
    public ArrayList<Book> getbooks(String cat){
        ArrayList<Book> data=new ArrayList<>();
        for(Book b: books){
            if(b.getCategores().equals(cat))
                data.add(b);
        }
        return data;
    }
    public String [] cat(){
        String [] cate=new String[]{"java","c","python"};
        return cate;
    }
}
