package com.npxception.demo.service;

import com.npxception.demo.dao.PostgreSQLPostDaoImpl;
import com.npxception.demo.dao.PostgreSQLUserDaoImpl;
import com.npxception.demo.entity.Post;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PostServiceTest {
  private PostService postService;
  private PostgreSQLPostDaoImpl postgreSQLPostDao;

  @Before
  public void setUp() throws Exception {
    postgreSQLPostDao = Mockito.mock(PostgreSQLPostDaoImpl.class);
    postService = new PostService(postgreSQLPostDao);
  }


  @Test
  public void PostTests() throws Exception {
    Post post1 = new Post();
    post1.setId(1);
    post1.setAuthorFirstName("a");
    post1.setAuthorLastName("A");
    post1.setContent("a");
    post1.setLikes(1);
    post1.setTime(1);
    post1.setVisibility(1);
    Post post2 = new Post();
    post2.setId(2);
    post1.setAuthorFirstName("b");
    post1.setAuthorLastName("B");
    post2.setContent("b");
    post2.setLikes(2);
    post2.setTime(2);
    post2.setVisibility(2);
    Post post3 = new Post();
    post3.setId(2);
    post1.setAuthorFirstName("c");
    post1.setAuthorLastName("C");
    post3.setContent("b");
    post3.setLikes(3);
    post3.setTime(3);
    post3.setVisibility(3);


    List<Post> allposts = new ArrayList<>();
    allposts.add(post1);
    allposts.add(post2);

    List<Post> post1list = new ArrayList<>();
    post1list.add(post1);

    List<Post> post2list = new ArrayList<>();
    post2list.add(post2);

    List<Post> sameContent = new ArrayList<>();
    sameContent.add(post2);
    sameContent.add(post3);

    Mockito.doReturn(post1).when(postgreSQLPostDao).getPostsById(1);
    Assert.assertEquals(post1, postgreSQLPostDao.getPostsById(1));

    Mockito.doReturn(allposts).when(postgreSQLPostDao).getAllPosts();
    Assert.assertEquals(allposts, postgreSQLPostDao.getAllPosts());

//    Mockito.doReturn(post2list).when(postgreSQLPostDao).getPostsByAuthor("b");
//    Assert.assertEquals(post2list, postgreSQLPostDao.getPostsByAuthor("b"));

    Mockito.doReturn(sameContent).when(postgreSQLPostDao).getPostsByContent("b");
    Assert.assertEquals(sameContent, postgreSQLPostDao.getPostsByContent("b"));

    Mockito.doReturn(post2list).when(postgreSQLPostDao).getPostsByLikes(2);
    Assert.assertEquals(post2list, postgreSQLPostDao.getPostsByLikes(2));

    Mockito.doReturn(post2list).when(postgreSQLPostDao).getPostsByUser(1);
    Assert.assertEquals(post2list, postgreSQLPostDao.getPostsByUser(1));

    Mockito.doReturn(post1list).when(postgreSQLPostDao).getPostsByUser(1);
    Assert.assertEquals(post1list, postgreSQLPostDao.getPostsByUser(1));

    Mockito.doReturn(post1list).when(postgreSQLPostDao).getPostsByUserFromGroup(1, 1, 1);
    Assert.assertEquals(post1list, postgreSQLPostDao.getPostsByUserFromGroup(1,1, 1));

    Mockito.doReturn(post2list).when(postgreSQLPostDao).getPostsFromGroup(2);
    Assert.assertEquals(post2list, postgreSQLPostDao.getPostsFromGroup(2));

    Mockito.doReturn(post2list).when(postgreSQLPostDao).getPostsFromGroup("b");
    Assert.assertEquals(post2list, postgreSQLPostDao.getPostsFromGroup("b"));

  }


}