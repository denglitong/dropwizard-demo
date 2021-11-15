package com.example.myproject;

import io.dropwizard.Configuration;

import javax.validation.constraints.NotEmpty;

/**
 * map to config yml file from argument specified from command
 * for example:
 * java -jar xxx.jar server application.yml
 * <p>
 * application.yml map to ApplicationConfiguration
 */
public class ApplicationConfiguration extends Configuration {

    @NotEmpty
    private String template;

    @NotEmpty
    private String defaultName = "Stranger";

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getDefaultName() {
        return defaultName;
    }

    public void setDefaultName(String defaultName) {
        this.defaultName = defaultName;
    }
}
