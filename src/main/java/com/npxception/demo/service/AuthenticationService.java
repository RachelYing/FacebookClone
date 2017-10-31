package com.npxception.demo.service;

import com.npxception.demo.helperMethods.UserInformation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Represents a controller for the Authentication service.
 */
@Service
public class AuthenticationService {

  @Autowired
  private UserService userService;

  public String getEmail() {
    return new UserInformation().getEmail();
  }

  public String getToken() {
    Integer token = new UserInformation().getEmail().hashCode();
    return token.toString();
  }
}