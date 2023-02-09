package com.example.profile.configuration;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Profileconfig1 {
  @Bean
  @Profile("oracle")
  public String oracleDataSource(){
    String dataSource = new String("oracle");
    // implementation skipped
    return dataSource;
  }


  @Bean
  @Profile("mysql")
  public String mySqlDataSource(){
    String dataSource = new String("mysql");;
    // implementation skipped
    return dataSource;
  }

}
