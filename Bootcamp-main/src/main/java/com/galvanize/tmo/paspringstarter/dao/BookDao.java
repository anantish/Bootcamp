package com.galvanize.tmo.paspringstarter.dao;

import com.galvanize.tmo.paspringstarter.model.Book;

import java.util.List;


public interface BookDao {

    default Book insertBook(Book book){
        return insertBook(book);
    }

    List<Book> selectAllBooks();

    void deleteAllBooks();
}
