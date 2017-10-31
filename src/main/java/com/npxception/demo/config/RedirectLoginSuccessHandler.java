package com.npxception.demo.config;

import com.npxception.demo.helperMethods.UserInformation;
import com.npxception.demo.service.AuthenticationService;
import com.npxception.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by RachelDi on 17/07/2017.
 * Edited by Atharva on 30/07/2017
 */
public class RedirectLoginSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  @Autowired
  private UserService userService;

  @Autowired
  private AuthenticationService authService;

  @Override
  public void onAuthenticationSuccess(HttpServletRequest httpServletRequest,
                                      HttpServletResponse httpServletResponse,
                                      Authentication authentication)
      throws IOException, ServletException {
    String email = new UserInformation().getEmail();
    com.npxception.demo.entity.User user = userService.getUserByEmail(email);
    String password = user.getPassword();
    Integer userid = user.getId();
    String token = authService.getToken();
    String create_session_sql = "INSERT INTO loginfo (userid, email, password, token) " +
        "SELECT ?, ?, ?, ? " +
        "WHERE NOT EXISTS (SELECT * FROM loginfo WHERE userid = ?)";
    jdbcTemplate.update(create_session_sql, new Object[]{userid, email, password, token, userid});
    super.onAuthenticationSuccess(httpServletRequest, httpServletResponse, authentication);
  }
}