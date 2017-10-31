package com.npxception.demo.controller;

import com.npxception.demo.exceptions.AuthenticationException;
import com.npxception.demo.helperMethods.UserInformation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * Represents a controller for the Authentication service.
 */
@RestController
public class LogoutController {

  @Autowired
  private JdbcTemplate jdbcTemplate;
  @RequestMapping(value = "{userid}/logout", method = RequestMethod.DELETE)
  public void logout(@ApiParam(value = "User ID", required = true)
                       @PathVariable("userid") int id) {
    try {
      String logout_sql = "DELETE FROM loginfo WHERE userid = ?";
      jdbcTemplate.update(logout_sql, new Object[]{id});
    } catch (EmptyResultDataAccessException except) {
      throw new AuthenticationException(id);
    }
  }

}