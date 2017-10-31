package com.npxception.demo.service;

import com.npxception.demo.dao.PostgreSQLUserDaoImpl;
import com.npxception.demo.entity.User;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UserServiceTest {
  private UserService userService;
  private PostgreSQLUserDaoImpl postgreSQLUserDao;

  @Before
  public void setUp() throws Exception {
    postgreSQLUserDao = Mockito.mock(PostgreSQLUserDaoImpl.class);
    userService = new UserService(postgreSQLUserDao);
  }

  @Test
  public void userTests() throws Exception {
    User user1 = new User();
    user1.setId(1);
    user1.setFirstName("a");
    user1.setLastName("a");
    user1.setEmail("a");
    user1.setAge(1);
    user1.setGender("a");
    user1.setCountry("a");
    user1.setCity("a");
    user1.setPassword("a");
    User user2 = new User();
    user2.setId(2);
    user2.setFirstName("b");
    user2.setLastName("b");
    user2.setEmail("b");
    user2.setAge(2);
    user2.setGender("b");
    user2.setCountry("b");
    user2.setCity("b");
    user2.setPassword("b");

    List<User> allUsers = new ArrayList<>();
    allUsers.add(user1);
    allUsers.add(user2);

    List<User> userOneList = new ArrayList<>();
    userOneList.add(user1);

    List<User> userTwoList = new ArrayList<>();
    userTwoList.add(user2);

    Mockito.doReturn(allUsers).when(postgreSQLUserDao).getAllUser();
    Assert.assertEquals(allUsers, postgreSQLUserDao.getAllUser());

    Mockito.doReturn(user1).when(postgreSQLUserDao).getUserById(1);
    Assert.assertEquals(user1, postgreSQLUserDao.getUserById(1));

    Mockito.doReturn(userOneList).when(postgreSQLUserDao).getUserByCity("a");
    Assert.assertEquals(userOneList, postgreSQLUserDao.getUserByCity("a"));


    Mockito.doReturn(user1).when(postgreSQLUserDao).getUserByEmail("a");
    Assert.assertEquals(user1, postgreSQLUserDao.getUserByEmail("a"));

    Mockito.doReturn(userOneList).when(postgreSQLUserDao).getUsersByFirstName("a");
    Assert.assertEquals(userOneList, postgreSQLUserDao.getUsersByFirstName("a"));

    Mockito.doReturn(userOneList).when(postgreSQLUserDao).getUsersByLastName("a");
    Assert.assertEquals(userOneList, postgreSQLUserDao.getUsersByLastName("a"));

    Mockito.doReturn(userOneList).when(postgreSQLUserDao).getUsersByAge(1);
    Assert.assertEquals(userOneList, postgreSQLUserDao.getUsersByAge(1));

    Mockito.doReturn(userOneList).when(postgreSQLUserDao).getUsersByGender("a");
    Assert.assertEquals(userOneList, postgreSQLUserDao.getUsersByGender("a"));


  }



}