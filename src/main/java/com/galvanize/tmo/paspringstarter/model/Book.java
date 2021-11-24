package com.galvanize.tmo.paspringstarter.model;
import java.util.concurrent.atomic.AtomicInteger;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Book {
    //private final UUID id;
    private String author;
    private String title;
    private int yearPublished;
    private int id;
    private static final AtomicInteger idGenerator = new AtomicInteger(0);

    public Book(@JsonProperty("id") int id,
                @JsonProperty("author")String author,
                @JsonProperty("title")String title,
                @JsonProperty("yearPublished")int yearPublished){

        this.author = author;
        this.title = title;
        this.yearPublished = yearPublished;
    }

    //public int getId() {
    //    return idGenerator.getAndIncrement();
    //}


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getId() {
        return idGenerator.getAndIncrement();
    }

    public void setId(int id) {
        this.id = id;
    }
}
