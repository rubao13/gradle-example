package com.hcengineapp;

import org.postgresql.ds.PGSimpleDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootApplication
public class Application {

    private static final String POSTGRES_USER = "postgres";
    private static final String POSTGRES_PASS = "postgres";
    private static final String JDBC_URL = "jdbc:postgresql://postgres:5432/";

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public DataSource postgresDataSource() throws SQLException {
        PGSimpleDataSource dataSource = new PGSimpleDataSource();
        dataSource.setUrl(JDBC_URL);
        dataSource.setUser(POSTGRES_USER);
        dataSource.setPassword(POSTGRES_PASS);
        dataSource.getConnection();
        return dataSource;
    }
}
