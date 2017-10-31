package com.npxception.demo.dao;

import com.npxception.demo.entity.DBPost;
import com.npxception.demo.entity.Post;

import java.util.Collection;

public interface PostDao {

  /**
   * Create a new post.
   *
   * @param post The post to be stored in the database.
   */
  void createPost(Post post);

  void updatePosts(int id, Post post);

  void removePostsById(int id1, int id);

  /**
   * Get a post based on the post id.
   *
   * @param id The post id in the post database
   * @return The post whose post id is {@code post}.
   */
  DBPost getPostsById(int id);

  /**
   * Get all the posts in the database.
   *
   * @return All the posts in the database.
   */
  Collection<DBPost> getAllPosts();

  /**
   * Get all the posts from a particular group.
   *
   * @param groupId The groupid from the database, of the group whose posts are required.
   * @return All the posts in the group with group id as {@code groupId}.
   */
  Collection<DBPost> getPostsFromGroup(int groupId);

  /**
   * Get all the posts from a particular group.
   *
   * @param name The name from the database, of the group whose posts are required.
   * @return All the posts in the group with group name as {@code name}.
   */
  Collection<DBPost> getPostsFromGroup(String name);

  /**
   * Get all the posts by a particular user based on the userId from the database.
   *
   * @param userId The user's user id in the database.
   * @return All the posts from the user with user id as {@code userId}.
   */
  Collection<DBPost> getPostsByUser(int userId);

//  /**
//   * Get all the posts by a particular user based on the users name.
//   * @param author The users name.
//   * @return All the posts from the user with name as {@code author}.
//   */
//  Collection<Post> getPostsByUser(String author);

  /**
   * Get all the posts from a particular group by a particular user.
   *
   * @param id1     The user id of the user whose makes request.
   * @param id2     The user id of the user whose posts are required.
   * @param groupId The group id of the group from where the posts are required.
   * @return All the posts by the user with user id as {@code userId} from the group with groupId as
   * {@code groupId}.
   */
  Collection<DBPost> getPostsByUserFromGroup(int id1, int id2, int groupId);


  Collection<DBPost> getPostsByUserFromGroupName(int id1, int id2, String name);


  Collection<DBPost> getPostsByContent(String content);

  Collection<DBPost> getPostsByAuthor(String authorFirs, String authorLast);

  Collection<DBPost> getPostsByLikes(int likes);

  Collection<DBPost> getPostsByLikedBy(int likedBy);

  Collection<DBPost> getPostsByTime(int time);

  Collection<DBPost> getPostUserMainPage(int userid);

  Collection<DBPost> getPostsByWall(int wall);
}