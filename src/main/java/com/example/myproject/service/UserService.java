package com.example.myproject.service;

import com.example.myproject.api.User;
import com.google.inject.Singleton;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Singleton
public class UserService {

    private static final AtomicLong counter = new AtomicLong();

    private static Long generateUserId() {
        return counter.incrementAndGet();
    }

    public User getUser() {
        return new User(generateUserId(), "compass");
    }

    public List<User> listUsers() {
        return Arrays.asList(
                new User(generateUserId(), "litong.deng"),
                new User(generateUserId(), "hongbin.chen"),
                new User(generateUserId(), "shiqi.rao")
        );
    }

}
