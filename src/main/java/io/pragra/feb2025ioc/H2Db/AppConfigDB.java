package io.pragra.feb2025ioc.H2Db;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class AppConfigDB {

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
    return new JdbcTemplate(dataSource);
};


    // Creating a bean for dataSource either we will do by application.properties
    /*@Bean
    public DataSource dataSource(){

        DataSource datasource = DataSourceBuilder
                                .create()
                                .url("jdbc:h2:mem:appDb")
                                .username("sa")
                                .password("sa123")
                                .build();
        return datasource;

    }*/
}
