package com.galvanize.tmo.paspringstarter.service;

import com.galvanize.tmo.paspringstarter.dao.BookDao;
import com.galvanize.tmo.paspringstarter.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class BookService {
    private final BookDao bookDao;

    @Autowired
    public BookService(@Qualifier("fakeDao") BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public int addBook(Book book){
        return bookDao.insertBook(book);
    }

    public List<Book> getallBooks(){
        return bookDao.selectAllBooks();
    }

    public void deleteallBooks() {
        bookDao.deleteAllBooks();
    }
}
