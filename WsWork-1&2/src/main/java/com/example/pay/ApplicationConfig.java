package com.example.pay;

import java.sql.*;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;


@Configuration
@ComponentScan
public class ApplicationConfig{  // (1)

    @Bean
    public DataSource dataSource() {  // (2)
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUsername("root");
        dataSource.setPassword("Jkmusic09*");
        dataSource.setUrl("jdbc:mysql://localhost:3306/zeldan");
        return dataSource;
    }

    
     
    
}