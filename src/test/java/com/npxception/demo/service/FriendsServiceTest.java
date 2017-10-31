package com.npxception.demo.service;

import com.npxception.demo.dao.PostgreSQLFriendsDaoImpl;
import com.npxception.demo.entity.User;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class FriendsServiceTest {
  private FriendsService friendsService;
  private PostgreSQLFriendsDaoImpl postgreSQLFriendsDao;

  @Before
  public void setUp() throws Exception {
    postgreSQLFriendsDao = Mockito.mock(PostgreSQLFriendsDaoImpl.class);
    friendsService = new FriendsService(postgreSQLFriendsDao);
  }

  @Test
  public void friendTests() throws Exception {
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

    Mockito.doReturn(userOneList).when(postgreSQLFriendsDao).getAllFriends(1);
    Assert.assertEquals(userOneList, postgreSQLFriendsDao.getAllFriends(1));


    Mockito.doReturn(userOneList).when(postgreSQLFriendsDao).getBlockList(1);
    Assert.assertEquals(userOneList, postgreSQLFriendsDao.getBlockList(1));

    Mockito.doReturn(userOneList).when(postgreSQLFriendsDao).getFriendsByName("a.b", 1);
    Assert.assertEquals(userOneList, postgreSQLFriendsDao.getFriendsByName("a.b",1));

    Mockito.doReturn(userOneList).when(postgreSQLFriendsDao).getInvitationList(1);
    Assert.assertEquals(userOneList, postgreSQLFriendsDao.getInvitationList(1));

    Mockito.doReturn(1).when(postgreSQLFriendsDao).countFriends(1);
    Assert.assertEquals(1, postgreSQLFriendsDao.countFriends(1));




  }

  @Test
  public void listByUserId() throws Exception {

  }

  @Test
  public void removeAllFriends() throws Exception {

  }

  @Test
  public void unFriend() throws Exception {

  }

  @Test
  public void countFriends() throws Exception {

  }

  @Test
  public void sendRequest() throws Exception {

  }

  @Test
  public void acceptRequest() throws Exception {

  }

}