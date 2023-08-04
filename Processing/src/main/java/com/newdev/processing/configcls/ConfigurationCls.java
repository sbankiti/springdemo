package com.newdev.processing.configcls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ConfigurationCls {

    @Autowired
    DataConfig dtcnfg;

/*    @Value("${database.properties.classname}")
    private String classname;
    @Value("${database.properties.url}")
    private String url;
    @Value("${database.properties.username}")
    private String username;
    @Value("${database.properties.password}")
    private String password;*/

    @Bean
    public DataSource mySqlDatasource(){

        return DataSourceBuilder.create()
                                .driverClassName(dtcnfg.getClassname())
                                .url(dtcnfg.getUrl())
                                .username(dtcnfg.getUsername())
                                .password(dtcnfg.getPassword())
                                .build();
    }
}
