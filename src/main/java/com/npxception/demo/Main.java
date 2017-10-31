package com.npxception.demo;

import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Main {

  public static void main(String[] args) {

    Flyway flyway = new Flyway();
    flyway.setDataSource("jdbc:postgresql://ec2-23-23-86-179.compute-1.amazonaws.com:5432/da9huhjmol649s?sslmode=require", "vtepdhsdicdkcw", "72a2ed2e11eb4ea75387d9c693acc7b2f2d5104bacaa1682d9fb2dd891e9710c");
    //flyway.setDataSource("jdbc:postgresql://localhost/", "postgres", "1234");
    flyway.setValidateOnMigrate(false);
//    flyway.repair();
  //  flyway.clean();
    flyway.migrate();
    SpringApplication.run(Main.class, args);
  }
}