package com.example.myproject.resouces;

import com.codahale.metrics.annotation.Timed;
import com.example.myproject.api.User;
import com.example.myproject.service.UserService;
import com.google.inject.Guice;
import com.google.inject.Injector;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.logging.Logger;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/api/v1/user")
@Produces(APPLICATION_JSON)
public class UserResource {

    private static final Logger logger = Logger.getAnonymousLogger();

    // TODO
    // @Inject
    // private UserService userService;

    @GET
    @Timed
    public User getUser() {
        Injector injector = Guice.createInjector();
        UserService userService = injector.getInstance(UserService.class);

        logger.info("userService: " + userService);
        return userService.getUser();
    }
}
