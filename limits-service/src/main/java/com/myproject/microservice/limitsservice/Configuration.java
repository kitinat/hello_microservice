package com.myproject.microservice.limitsservice;

import lombok.Data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
@Data
public class Configuration {

    private int minimum;
    private int maximum;


    public Configuration() {
    }

    public Configuration(int minimum, int maximum) {
    	super();
        this.minimum = minimum;
        this.maximum = maximum;
    }
}
