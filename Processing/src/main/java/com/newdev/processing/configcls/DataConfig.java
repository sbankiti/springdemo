package com.newdev.processing.configcls;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "database.properties")
@Data
public class DataConfig {

    private String classname;
    private String url;
    private String username;
    private String password;
}
