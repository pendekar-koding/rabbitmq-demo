package com.pendekar.rabbitmqdemo.model;

public class MyMessage {
    private String content;
    private int id;

    // Getters and Setters

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MyMessage [content=" + content + ", id=" + id + "]";
    }
}

