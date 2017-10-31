package com.npxception.demo.entity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PostTest {
  private Post post1;
  private Post mt;
  private Post newPost;
  @Before
  public void setUp() throws Exception {
    this.post1 = new Post("Sally","Smith", "Hello World", 5, 12, 1,"a.b");
    this.mt = new Post();
    this.newPost = new Post("Joe", "Apple","a", 37, 37, 37,"c.d");
  }

  @Test
  public void testsForAllSetters() throws Exception {
    this.mt.setId(37);
    this.mt.setAuthorFirstName("Joe");
    this.mt.setAuthorLastName("Joe");

    this.mt.setContent("a");
    this.mt.setLikes(37);
    this.mt.setTime(37);
    this.mt.setVisibility(37);
    Assert.assertEquals(mt, newPost);
  }

  @Test
  public void getId() throws Exception {
    Assert.assertEquals(post1.getId(), 1);

  }


  @Test
  public void getAuthorFirstName() throws Exception {
    Assert.assertEquals(post1.getAuthorFirstName(), "Sally");
  }


  @Test
  public void getAuthorLastName() throws Exception {
    Assert.assertEquals(post1.getAuthorFirstName(), "Smith");
  }


  @Test
  public void getContent() throws Exception {
    Assert.assertEquals(post1.getContent(),"Hello World");
  }


  @Test
  public void getLikes() throws Exception {
    Assert.assertEquals(post1.getLikes(), 5);
  }




  @Test
  public void getTime() throws Exception {
    Assert.assertEquals(post1.getTime(), 12);

  }

  @Test
  public void getVisibility() throws Exception {
    Assert.assertEquals(post1.getVisibility(), 1);
  }



}