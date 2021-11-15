package com.example.myproject.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Saying {

    private Long id;

    private String content;

    public Saying(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    @JsonProperty
    public Long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }
}
