package com.npxception.demo.config;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by RachelDi on 17/07/2017.
 */
public class RedirectLoginFailHandler implements AuthenticationFailureHandler {

  @Override
  public void onAuthenticationFailure(HttpServletRequest httpServletRequest,
                                      HttpServletResponse httpServletResponse,
                                      AuthenticationException e)
      throws IOException, ServletException {
    httpServletResponse.sendRedirect("http://www.youtube.com");
  }
}