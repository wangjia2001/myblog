package com.example.dbl.elem;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "blog")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    @Column(name = "date")
    Date date;
    @Column(name = "title")
    String title;
    @Column(name = "content")
    String content;


    public Blog() {
    }

    public Blog(int id,Date date, String content) {
        this.id = id;
        this.date = date;
        this.content = content;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", title='" + title + '\''+
                ", content='" + content +
                '}';
    }
}
