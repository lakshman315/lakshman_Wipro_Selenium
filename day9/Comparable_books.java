package day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Book implements Comparable<Book> 
{
    private int bookId;
    private String title;

    public Book(int bookId, String title) 
    {
        this.bookId = bookId;
        this.title = title;
    }

    public int getBookId() 
    {
        return bookId;
    }

    public String getTitle() 
    {
        return title;
    }

 
    public int compareTo(Book other) 
    {
       
        return Integer.compare(other.bookId, this.bookId);
    }

 
    public String toString() 
    {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                '}';
    }
}

public class Comparable_books 
{
    public static void main(String[] args)
    {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Midnight's Children"));
        books.add(new Book(2, "The White Tiger"));
        books.add(new Book(3, "A Suitable Boy"));

        Collections.sort(books);

        for (Book book : books) 
        {
            System.out.println(book);
        }
    }
}

