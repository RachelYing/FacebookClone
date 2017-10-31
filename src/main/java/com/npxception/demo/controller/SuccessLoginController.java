package com.npxception.demo.controller;

import com.npxception.demo.entity.User;
import com.npxception.demo.service.AuthenticationService;
import com.npxception.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SuccessLoginController {

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


}