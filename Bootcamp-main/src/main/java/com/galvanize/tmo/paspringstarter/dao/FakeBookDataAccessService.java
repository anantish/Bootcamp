package com.galvanize.tmo.paspringstarter.dao;

import com.galvanize.tmo.paspringstarter.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository("fakeDao")
public class FakeBookDataAccessService implements BookDao {

    private static ArrayList<Book> listOfBooks = new ArrayList<>();

    @Override
    public Book insertBook(Book book) {
        List<Book> listOfBooks = selectAllBooks();
        Book newBook = new Book(book.getId(), book.getAuthor(),book.getTitle(), book.getYearPublished());
        newBook.setId(book.getId());
        newBook.setAuthor(book.getAuthor());
        newBook.setTitle(book.getTitle());
        newBook.setYearPublished(book.getYearPublished());
        listOfBooks.add(newBook);
        return newBook ;
    }


    @Override
    public List<Book> selectAllBooks() { return listOfBooks;  }

    @Override
    public void deleteAllBooks(){
        listOfBooks = null;
    }



}

