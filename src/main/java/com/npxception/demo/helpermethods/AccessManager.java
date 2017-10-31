package com.npxception.demo.helperMethods;

import com.npxception.demo.exceptions.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class AccessManager {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  public AccessManager() {
  }

  public void checkUser(int id, String token) {
    try {
      String database_token_sql = "SELECT token FROM loginfo WHERE userid = ?";
      String database_token = jdbcTemplate.queryForObject(database_token_sql, new Object[]{id}, String.class);
      String database_id_sql = "SELECT userid FROM loginfo WHERE token = ?";
      Integer database_id = jdbcTemplate.queryForObject(database_id_sql, new Object[]{token}, Integer.class);
      if ((!database_id.equals(id)) || (!database_token.equals(token))) {
        throw new AuthenticationException(id);
      }
    } catch (EmptyResultDataAccessException except) {
      throw new AuthenticationException((id));
    }
  }
}