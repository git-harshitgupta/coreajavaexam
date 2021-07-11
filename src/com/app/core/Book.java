package com.app.core;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable {
    //Defining all the private variables
    private String title;
    private String authorName;
    private double price;
    private Categorey categorey;
    private LocalDate publishDate;

    //Constructor for class Book with all parameter
    public Book(String title, String authorName, double price, Categorey categorey, LocalDate date) {
        this.title = title;
        this.authorName = authorName;
        this.price = price;
        this.categorey = categorey;
        this.publishDate = date;
    }



    //getter and setter for all the variables
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Categorey getCategorey() {
        return categorey;
    }

    public void setCategorey(Categorey categorey) {
        this.categorey = categorey;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate date) {
        this.publishDate = date;
    }

    //overriding tostring method from object class to display value of the variables
    @Override
    public String toString() {
        return
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", price=" + price +
                ", categorey=" + categorey +
                ", PublishDatedate=" + publishDate
                ;
    }
}
