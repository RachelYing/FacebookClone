package com.npxception.demo.entity;

/**
 * Created by RachelDi on 01/08/2017.
 */
public class DBPost {

  private int id;
  private String authorFirst;
  private String authorLast;
  private String content;
  private int likes;
  private int time;
  private int visibility;
  private int wall;

  public DBPost(String authorFirst,
                String authorLast, String content, int likes,
                int time, int visibility, int wall){
    this.authorFirst = authorFirst;
    this.authorLast = authorLast;
    this.content = content;
    this.likes = likes;
    this.time = time;
    this.visibility = visibility;
    this.wall = wall;
  }

  public DBPost() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getAuthorFirst() {
    return authorFirst;
  }

  public void setAuthorFirst(String authorFirst) {
    this.authorFirst = authorFirst;
  }

  public String getAuthorLast() {
    return authorLast;
  }

  public void setAuthorLast(String authorLast) {
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

  public int getWall() {
    return wall;
  }

  public void setWall(int wall) {
    this.wall = wall;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    DBPost dbPost = (DBPost) o;

    if (getId() != dbPost.getId()) return false;
    if (getLikes() != dbPost.getLikes()) return false;
    if (getTime() != dbPost.getTime()) return false;
    if (getVisibility() != dbPost.getVisibility()) return false;
    if (getWall() != dbPost.getWall()) return false;
    if (getAuthorFirst() != null ? !getAuthorFirst().equals(dbPost.getAuthorFirst()) : dbPost.getAuthorFirst() != null)
      return false;
    if (getAuthorLast() != null ? !getAuthorLast().equals(dbPost.getAuthorLast()) : dbPost.getAuthorLast() != null)
      return false;
    return getContent() != null ? getContent().equals(dbPost.getContent()) : dbPost.getContent() == null;
  }

  @Override
  public int hashCode() {
    int result = getId();
    result = 31 * result + (getAuthorFirst() != null ? getAuthorFirst().hashCode() : 0);
    result = 31 * result + (getAuthorLast() != null ? getAuthorLast().hashCode() : 0);
    result = 31 * result + (getContent() != null ? getContent().hashCode() : 0);
    result = 31 * result + getLikes();
    result = 31 * result + getTime();
    result = 31 * result + getVisibility();
    result = 31 * result + getWall();
    return result;
  }

  @Override
  public String toString() {
    return "DBPost{" +
        "id=" + id +
        ", authorFirst='" + authorFirst + '\'' +
        ", authorLast='" + authorLast + '\'' +
        ", content='" + content + '\'' +
        ", likes=" + likes +
        ", time=" + time +
        ", visibility=" + visibility +
        ", wall=" + wall +
        '}';
  }
}
