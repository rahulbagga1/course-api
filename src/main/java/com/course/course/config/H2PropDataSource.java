package com.course.course.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class H2PropDataSource {

//    @Autowired
//    private H2Prop h2Prop;

    @Bean(name = "h2datasource")
    @ConfigurationProperties(prefix = "spring.datasource2")
    public DataSource h2DataSource() {
        return DataSourceBuilder.create().build();


//        HikariDataSource source = new HikariDataSource();
//        source.setDriverClassName(h2Prop.getDriverClassName());
//        source.setJdbcUrl(h2Prop.getUrl());
//        source.setUsername(h2Prop.getUsername());
//        source.setPassword(h2Prop.getPassword());
    }

}
