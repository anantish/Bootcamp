package com.galvanize.tmo.paspringstarter.api;

import com.galvanize.tmo.paspringstarter.model.Book;
import com.galvanize.tmo.paspringstarter.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/books")
@RestController
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @PostMapping
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getallBooks();
    }

    @DeleteMapping
    public void deleteBooks(){
        bookService.deleteallBooks();
    }

}
