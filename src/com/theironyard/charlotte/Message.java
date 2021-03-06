package com.theironyard.charlotte;

public class Message {
    Integer id;
    String author;
    String text;

    public Message () {}

    public Message(Integer id, String author, String text) {
        this.id = id;
        this.author = author;
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
