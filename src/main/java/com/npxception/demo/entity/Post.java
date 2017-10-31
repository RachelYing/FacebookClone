package com.npxception.demo.entity;

import com.npxception.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

public class Post {
  private int id;
  private String authorFirst;
  private String authorLast;
  private String content;
  private int likes;
  private int time;
  private int visibility;
  private String wallName;

  @Autowired
  UserService userService;

  public Post(String authorFirst, String authorLast, String content,
              int likes, int time, int visibility, String wallName) {
    this.authorFirst = authorFirst;
    this.authorLast = authorLast;
    this.content = content;
    this.likes = likes;
    this.time = time;
    this.visibility = visibility;
    this.wallName = wallName;
  }

  public String getWallName() {
    return wallName;
  }

  public void setWallName(String wallName) {
    this.wallName = wallName;
  }

  public Post() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getAuthorFirstName() {
    return this.authorFirst;
  }

  public String getAuthorLastName() {
    return this.authorLast;
  }

  public void setAuthorFirstName(String authorFirst) {
    this.authorFirst = authorFirst;
  }

  public void setAuthorLastName(String authorLast) {
    this.authorLast = authorLast;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public int getLikes() {
    return likes;
  }

  public void setLikes(int likes) {
    this.likes = likes;
  }

  public int getTime() {
    return time;
  }

  public void setTime(int time) {
    this.time = time;
  }

  public int getVisibility() {
    return visibility;
  }

  public void setVisibility(int visibility) {
    this.visibility = visibility;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Post post = (Post) o;

    if (id != post.id) return false;
    if (authorFirst != post.authorFirst) return false;
    if (authorLast != post.authorLast) return false;

    if (likes != post.likes) return false;
    if (time != post.time) return false;
    if (visibility != post.visibility) return false;
    if (wallName != post.wallName) return false;
    return content != null ? content.equals(post.content) : post.content == null;
  }

  @Override
  public int hashCode() {
    int result = getId();
    result = 31 * result + (authorFirst != null ? authorFirst.hashCode() : 0);
    result = 31 * result + (authorLast != null ? authorLast.hashCode() : 0);
    result = 31 * result + (getContent() != null ? getContent().hashCode() : 0);
    result = 31 * result + getLikes();
    result = 31 * result + getTime();
    result = 31 * result + getVisibility();
    result = 31 * result + getVisibility();
    result = 31 * result + (wallName != null ? wallName.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Post{" +
        "id=" + id +
        ", authorFirst='" + authorFirst + '\'' +
        ", authorLast='" + authorLast + '\'' +
        ", content='" + content + '\'' +
        ", likes=" + likes +
        ", time=" + time +
        ", visibility=" + visibility +
        ", wallName='" + wallName + '\'' +
        '}';
  }
}

