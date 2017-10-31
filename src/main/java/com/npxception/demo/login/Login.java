package com.npxception.demo.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by RachelDi on 25/06/2017.
 */
public class Login {
  @Autowired
  private JdbcTemplate jdbcTemplate;

  public static int userid;

  // login will set the user id, so later all the operations will be bound to this id
//  public void login(String email, String password) {
//    //int userid;
//    final String sql = "SELECT FROM users WHERE email = ? AND password = ?";
//    User user = jdbcTemplate.queryForObject(sql, new UserRowMapper(), email, password);
//
//    if (user != null) {
//      userid = user.getId();
//      System.out.println("Login Successfully");
//    } else {
//      System.out.println("Email and Password does not match");
//    }
//  }
}