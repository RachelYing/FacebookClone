package com.npxception.demo.helperMethods;

import com.npxception.demo.entity.User;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by RachelDi on 18/06/2017.
 */
public class UserRowMapper implements RowMapper<User> {
  @Override
  public User mapRow(ResultSet resultSet, int i) throws SQLException {

    User user = new User();
    user.setAge(resultSet.getInt("age"));
    user.setCity(resultSet.getString("city"));
    user.setCountry(resultSet.getString("country"));
    user.setEmail(resultSet.getString("email"));
    user.setFirstName(resultSet.getString("firstname"));
    user.setGender(resultSet.getString("gender"));
    user.setId(resultSet.getInt("userid"));
    user.setLastName(resultSet.getString("lastname"));
    user.setPassword(resultSet.getString("password"));
    user.setRole(resultSet.getString("role"));
    return user;
  }

}