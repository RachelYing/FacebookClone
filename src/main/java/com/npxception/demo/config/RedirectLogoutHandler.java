package com.npxception.demo.config;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by RachelDi on 21/07/2017.
 */
public class RedirectLogoutHandler implements LogoutSuccessHandler {
  @Override
  public void onLogoutSuccess(HttpServletRequest request,
                              HttpServletResponse response, Authentication authentication)
      throws IOException, ServletException {
    String URL = "/login";
    response.sendRedirect(URL);
  }
}
