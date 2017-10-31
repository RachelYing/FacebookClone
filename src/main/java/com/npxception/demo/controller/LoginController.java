package com.npxception.demo.controller;

import com.npxception.demo.entity.User;
import com.npxception.demo.exceptions.DuplicateEmailException;
import com.npxception.demo.service.AuthenticationService;
import com.npxception.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Created by Atharva Jakkanwar on 31-Jul-17.
 */
@Controller
@Api(description = "Login Controller")
public class LoginController {

  @Autowired
  private UserService userService;

  @Autowired
  AuthenticationService authenticationService;

  @RequestMapping(method = RequestMethod.GET, value = "/successLogin")
  public
  @ResponseBody
  String createToken() {
    User user = userService.getUserByEmail(authenticationService.getEmail());
    String token = "authorization_token = " + authenticationService.getToken();
    Integer id = user.getId();
    return token + "\n" + "userid = " + id;
  }

  @ApiOperation(value = "Registers User WHERE: id is not required AND gender must be Male or Female")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Successfully registered user"),
      @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
      @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
      @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
  })

  @RequestMapping(value = "/register", method = RequestMethod.POST,
      consumes = MediaType.APPLICATION_JSON_VALUE)
  public void register(
      @ApiParam(value = "User information", required = true)
      @RequestBody User user) {
    try {
      System.out.println(user.getFirstName());
      System.out.println(user.getLastName());
      userService.register(user);
    } catch (DataIntegrityViolationException e) {
      throw new DuplicateEmailException(user);
    }
  }


}