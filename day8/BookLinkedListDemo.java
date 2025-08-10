package day8;

import java.util.LinkedList;

class Book {
    int id;
    String title;
    String author;

    public Book(int id, String title, String author) 
    {
        this.id = id;
        this.title = title;
        this.author = author;
    }
}

public class BookLinkedListDemo {
    public static void main(String[] args)
    {
        LinkedList<Book> bookList = new LinkedList<>();

        bookList.add(new Book(101, "The God of Small Things", "Arundhati Roy"));
        bookList.add(new Book(102, "Gitanjali", "Rabindranath Tagore"));
        bookList.add(new Book(103, "To Kill a Mockingbird", "Harper Lee"));

     
        for (Book book : bookList) 
        {
            System.out.println("ID: " + book.id + ", Title: " + book.title + ", Author: " + book.author);
        }
    }
}
