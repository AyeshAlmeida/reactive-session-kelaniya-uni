package hms.reactive.session.sample.reactivesessionkelaniyauni.models;

import org.springframework.data.annotation.Id;

public class Application {
    @Id
    private long id;
    private String name;
    private String version;
    private String author;
    private String type;

    @Override
    public String toString() {
        return "Application{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public Application(){}

    public Application(long id, String name, String version, String author, String type) {
        this.id = id;
        this.name = name;
        this.version = version;
        this.author = author;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
