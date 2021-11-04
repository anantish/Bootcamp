package com.galvanize.tmo.paspringstarter.dao;

import com.galvanize.tmo.paspringstarter.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("fakeDao")
public class FakeBookDataAccessService implements BookDao {

    private static List<Book> DB = new ArrayList<>();

    @Override
    public int insertBook(Book book) {
        DB.add(new Book(book.getId(), book.getAuthor(), book.getTitle(), book.getYearPublished()));
        return 1;
    }


    @Override
    public List<Book> selectAllBooks() {
        return DB;
    }
    @Override
    public void deleteAllBooks(){
        DB.clear();
    }
}
