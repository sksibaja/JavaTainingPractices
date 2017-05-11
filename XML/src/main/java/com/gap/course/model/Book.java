package com.gap.course.model;

import java.util.Date;

/**
 * Created by ssibaja on 4/26/17.
 */
public class Book {

    private String id;
    private String author;
    private String title;
    private String genre;
    private Double price;
    private Date publishDate;
    private String description;

    public Book(String id, String author, String title, String genre, Double price, Date publishDate, String description) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.publishDate = publishDate;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public Double getPrice() {
        return price;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public String getDescription() {
        return description;
    }

  /*  @Override
    public String toString(){
        return String.format();
    }

    @Override
    public boolean equals(Object obj){
        Book book = (Book)obj;
        return book != null
    }*/

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                ", publishDate=" + publishDate +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (!getId().equals(book.getId())) return false;
        if (getAuthor() != null ? !getAuthor().equals(book.getAuthor()) : book.getAuthor() != null) return false;
        if (getTitle() != null ? !getTitle().equals(book.getTitle()) : book.getTitle() != null) return false;
        if (getGenre() != null ? !getGenre().equals(book.getGenre()) : book.getGenre() != null) return false;
        if (getPrice() != null ? !getPrice().equals(book.getPrice()) : book.getPrice() != null) return false;
        if (getPublishDate() != null ? !getPublishDate().equals(book.getPublishDate()) : book.getPublishDate() != null)
            return false;
        return getDescription() != null ? getDescription().equals(book.getDescription()) : book.getDescription() == null;
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + (getAuthor() != null ? getAuthor().hashCode() : 0);
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getGenre() != null ? getGenre().hashCode() : 0);
        result = 31 * result + (getPrice() != null ? getPrice().hashCode() : 0);
        result = 31 * result + (getPublishDate() != null ? getPublishDate().hashCode() : 0);
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        return result;
    }
}
