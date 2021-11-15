package com.example.myproject;

import com.example.myproject.health.TemplateHealthCheck;
import com.example.myproject.resouces.HelloWorldResource;
import com.example.myproject.resouces.UserResource;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class Application extends io.dropwizard.Application<ApplicationConfiguration> {

    public static void main(String[] args) throws Exception {
        new Application().run(args);
    }

    @Override
    public void initialize(Bootstrap<ApplicationConfiguration> bootstrap) {
        //  configure aspects before application run
    }

    @Override
    public void run(ApplicationConfiguration configuration, Environment environment)
            throws Exception {
        final TemplateHealthCheck healthCheck = new TemplateHealthCheck(configuration.getTemplate());
        environment.healthChecks().register("template", healthCheck);

        final HelloWorldResource helloWorldResource = new HelloWorldResource(
                configuration.getTemplate(),
                configuration.getDefaultName());

        environment.jersey().register(helloWorldResource);
        environment.jersey().register(new UserResource());
    }
}
