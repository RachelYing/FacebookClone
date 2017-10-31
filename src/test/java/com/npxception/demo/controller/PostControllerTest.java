package com.npxception.demo.controller;

import com.npxception.demo.entity.Post;
import com.npxception.demo.service.PostService;

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
@WebMvcTest (PostController.class)
public class PostControllerTest {

  @MockBean
  private PostService postService;
  @Autowired
  private MockMvc mockMvc;

  @Test
  public void postControllerTest() throws Exception {
    Post mockPost = new Post();
    mockPost.setId(1);
    mockPost.setAuthorFirstName("a");
    mockPost.setAuthorLastName("A");
    mockPost.setContent("a");
    mockPost.setLikes(1);
    mockPost.setTime(1);
    mockPost.setVisibility(1);

    Mockito.doReturn(mockPost).when(postService).getPostsById(1);
    Assert.assertEquals(mockPost, postService.getPostsById(1));


  }

}