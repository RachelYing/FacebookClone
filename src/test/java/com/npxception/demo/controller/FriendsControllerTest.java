package com.npxception.demo.controller;

import com.npxception.demo.entity.User;
import com.npxception.demo.service.FriendsService;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(FriendsController.class)
public class FriendsControllerTest {

  @MockBean
  private FriendsService friendsService;
  @Autowired
  private MockMvc mockMvc;

  @Test
  public void getUserById() throws Exception {
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

    List<User> list = new ArrayList<>();
    list.add(user1);
    list.add(user2);

    Mockito.doReturn(list).when(friendsService).getAllFriends(1);
    Assert.assertEquals(list, friendsService.getAllFriends(1));

  }


}