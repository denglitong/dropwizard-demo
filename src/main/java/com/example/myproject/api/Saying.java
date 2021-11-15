package com.example.myproject.api;

public class Saying {

    private Long id;

    private String content;

    public Saying(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
