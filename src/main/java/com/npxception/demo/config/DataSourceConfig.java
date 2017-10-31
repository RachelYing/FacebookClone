package com.npxception.demo.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by RachelDi on 10/07/2017.
 */
@Configuration
public class DataSourceConfig {
  @Bean(name = "primary")
  @ConfigurationProperties(prefix = "spring.datasource")
  protected DataSource primaryDataSource() {
    return DataSourceBuilder.create().build();
  }
}