package com.galvanize.tmo.paspringstarter.model;
import java.util.concurrent.atomic.AtomicInteger;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Book {
    //private final UUID id;
    private final String author;
    private final String title;
    private final int yearPublished;
    private static final AtomicInteger idGenerator = new AtomicInteger(0);
    private final Integer id;

    public Book(@JsonProperty("id") Integer id,
                @JsonProperty("author")String author,
                @JsonProperty("title")String title,
                @JsonProperty("yearPublished")int yearPublished){

        this.id = getId();
        this.author = author;
        this.title = title;
        this.yearPublished = yearPublished;
    }

    public int getId() {
        return idGenerator.getAndIncrement() - 8;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

}
