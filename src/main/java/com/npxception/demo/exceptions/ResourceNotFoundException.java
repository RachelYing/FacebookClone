package com.npxception.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Handles 404 errors in the service.
 * Created by Atharva Jakkanwar on 15-Jul-17.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "The resource you were trying to reach is not found.")
public class ResourceNotFoundException extends RuntimeException {
  public ResourceNotFoundException(String param1) {
    super(param1 + " not found!");
  }

  public ResourceNotFoundException(int param1) {
    super(param1 + " not found!");
  }

  public ResourceNotFoundException(String param1, String param2) {
    super("Either one of " + param1 + " " + param2 + " not found!");
  }
}
