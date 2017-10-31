package com.npxception.demo.entity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
  private User user1;
  private User mt;
  private User newUser;
  @Before
  public void setUp() throws Exception {
    this.user1 = new User("Bobby", "McBob", "abc", 123, "truck", "ABC", "DEF", "1234", "USER");
    this.mt = new User();
    this.newUser = new User("f", "l", "e", 2, "g", "c", "c", "p", "Q");


  }

  @Test
  public void testAllSetters() throws Exception {
    mt.setId(2);
    mt.setFirstName("f");
    mt.setLastName("l");
    mt.setEmail("e");
    mt.setAge(2);
    mt.setGender("g");
    mt.setCountry("c");
    mt.setCity("c");
    mt.setPassword("p");
    Assert.assertEquals(mt, newUser);
  }

  @Test
  public void getId() throws Exception {
    Assert.assertEquals(user1.getId(), 1);

  }


  @Test
  public void getFirstName() throws Exception {
    Assert.assertEquals(user1.getFirstName(), "Bobby");

  }


  @Test
  public void getAge() throws Exception {
    Assert.assertEquals(user1.getAge(),123);
  }


  @Test
  public void getGender() throws Exception {
    Assert.assertEquals(user1.getGender(), "truck");
  }


  @Test
  public void getLastName() throws Exception {
    Assert.assertEquals(user1.getLastName(), "McBob");
  }

  @Test
  public void getEmail() throws Exception {
    Assert.assertEquals(user1.getEmail(), "abc");
  }


  @Test
  public void getCountry() throws Exception {
    Assert.assertEquals(user1.getCountry(), "ABC");
  }


  @Test
  public void getCity() throws Exception {
    Assert.assertEquals(user1.getCity(), "DEF");
  }



}