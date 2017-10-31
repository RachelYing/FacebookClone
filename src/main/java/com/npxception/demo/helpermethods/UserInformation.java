package com.npxception.demo.helperMethods;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by RachelDi on 29/06/2017.
 * Edited by Atharva on 31/07/2017
 */
public class UserInformation {


  public String[] splitUserNameWithDot(String name) {
    String[] result = name.split("\\.");
    return result;
  }

  public String[] splitUserNameWithoutDot(String name) {
    String[] result = name.split(" ");
    return result;
  }

  public String getEmail() {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    return authentication.getName();
  }

  public String getHeaders() {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    return authentication.getDetails().toString();
  }

}
