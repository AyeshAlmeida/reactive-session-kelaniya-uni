package hms.reactive.session.sample.reactivesessionkelaniyauni.models;

import org.springframework.data.annotation.Id;

public class Book {
    @Id
    private long id;
    private String author;
    private String name;
    private String genre;
    private String type;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public Book(){}

    public Book(long id, String author, String title, String genre, String type) {
        this.id = id;
        this.author = author;
        this.name = title;
        this.genre = genre;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
