package com.npxception.demo.exceptions;

import com.npxception.demo.entity.User;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

<<<<<<< HEAD
@ResponseStatus(value = HttpStatus.I_AM_A_TEAPOT, reason = "The given Email is already in the database.")
=======
/**
 * Created by bryan on 7/30/2017.
 */
@ResponseStatus(value = HttpStatus.CONFLICT, reason = "The given Email is already in the database.")
>>>>>>> 938825c55334ea3fb9e649ecd4402510b1194fa6
public class DuplicateEmailException extends RuntimeException {
  public DuplicateEmailException(String param1) {
    super(param1 + "already exists!");
  }

  public DuplicateEmailException(User param1) {
    super(param1 + "already exists!");
  }

}
