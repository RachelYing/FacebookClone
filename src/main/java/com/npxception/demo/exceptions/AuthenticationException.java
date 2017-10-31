package com.npxception.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Atharva Jakkanwar on 30-Jul-17.
 */
@ResponseStatus(value = HttpStatus.FORBIDDEN, reason = "Incorrect credentials!")
public class AuthenticationException extends RuntimeException {
  public AuthenticationException(int userid) {
    super("Incorrect credentials for user: " + userid);
  }
}
