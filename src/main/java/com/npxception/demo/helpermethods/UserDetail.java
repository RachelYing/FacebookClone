package com.npxception.demo.helperMethods;

import com.npxception.demo.entity.User;

/**
 * Created by RachelDi on 27/07/2017.
 */
public class UserDetail {
  String firstName;
  String lastName;
  int id;

  public UserDetail(String firstName, String lastName, int id) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.id = id;
  }

  public UserDetail(User user) {
    this.firstName = user.getFirstName();
    this.lastName = user.getFirstName();
    this.id = user.getId();
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getId() {
    return id;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setId(int id) {
    this.id = id;
  }
}
