package com.example.myproject.service;

import com.example.myproject.api.User;

import java.util.concurrent.atomic.AtomicLong;

public class UserService {

    private static final AtomicLong counter = new AtomicLong();

    public User getUser() {
        return new User(counter.incrementAndGet(), "compass");
    }
}
