package com.exercise.leyeredModel.models;
import lombok.Getter;
import lombok.Setter;

// model that we need to create objects
@Setter @Getter
public class Post {
    private int id;
    private String title;
    private  String author;

    public Post() {
    }

    public Post(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
}
