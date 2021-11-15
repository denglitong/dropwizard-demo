package com.example.myproject.resouces;

import com.codahale.metrics.annotation.Timed;
import com.example.myproject.api.User;
import com.example.myproject.service.UserService;
import com.google.inject.Guice;
import com.google.inject.Injector;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/api/v1/user")
@Produces(APPLICATION_JSON)
public class UserResource {

    @GET
    @Timed
    public User getUser() {
        // TODO
        Injector injector = Guice.createInjector();
        UserService userService = injector.getInstance(UserService.class);
        return userService.getUser();
    }

    @GET
    @Path("/list")
    @Timed
    public List<User> listUsers() {
        Injector injector = Guice.createInjector();
        UserService userService = injector.getInstance(UserService.class);
        return userService.listUsers();
    }
}
