package com.npxception.demo.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
  @Qualifier("primary")
  @Autowired
  private DataSource dataSource;


  @Bean
  public RedirectLoginSuccessHandler loginSuccessHandler() {
    RedirectLoginSuccessHandler successHandler = new RedirectLoginSuccessHandler();
    successHandler.setDefaultTargetUrl("/successLogin");
    return successHandler;
  }

  @Bean
  public RedirectLogoutHandler logoutHandler() {
    return new RedirectLogoutHandler();
  }

  @Bean
  public RedirectLoginFailHandler loginFailedHandler() {
    return new RedirectLoginFailHandler();
  }

  @Autowired
  protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    auth.jdbcAuthentication().dataSource(dataSource)
        .usersByUsernameQuery("SELECT email AS principal, password AS credentials" +
            ", true FROM users WHERE email = ?")
        .authoritiesByUsernameQuery("SELECT email AS principal, role AS role FROM users " +
            "WHERE email = ?");
  }

  @Override
  protected void configure(HttpSecurity httpSecurity) throws Exception {
    httpSecurity
        .authorizeRequests()
        .antMatchers("**/register").anonymous()
        .antMatchers("/").hasAnyAuthority("ADMIN", "USER")
        .antMatchers("/users").hasAuthority("ADMIN")
        .antMatchers("/groups").hasAuthority("ADMIN")
        .antMatchers("/group/**").hasAuthority("ADMIN")
        .antMatchers("/posts").hasAuthority("ADMIN")
        .antMatchers("**/auth/**").hasAnyAuthority("ADMIN", "USER")
        .and().formLogin().successHandler(loginSuccessHandler())
        .and().logout().logoutSuccessHandler(logoutHandler())
        .and().httpBasic();
    httpSecurity.csrf().disable();
  }
}