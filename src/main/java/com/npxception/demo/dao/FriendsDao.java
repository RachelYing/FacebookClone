
package com.npxception.demo.dao;

import com.npxception.demo.entity.User;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by RachelDi on 13/06/2017.
 */
public interface FriendsDao {

  /**
   * Get a list of all the friends of a user
   *
   * @param id the user id
   * @return all the friends of the user
   */
  Collection<User> getAllFriends(int id);

  /**
   * Get a list of common friends between 2 users
   *
   * @param id       id of user1
   * @param username id of user2
   * @return a list of common friends between 2 users
   */
  Collection<User> commonFriends(int id, String username);

  /**
   * Get a list of friends, who have same last name or first name, of a user
   *
   * @param username the name of the friend
   * @param id       the id of the user
   * @return a list of friends, who have same last name or first name, of a user
   */
  Collection<User> getFriendsByName(String username, int id);

  /**
   *
   * @param id
   * @return
   */
  Collection<User> getInvitationList(int id);

  /**
   *
   * @param id
   * @return
   */
  Collection<User> getBlockList(int id);

  /**
   * Remove all friends of a user
   *
   * @param id the user id
   */
  void removeAllFriends(int id);

  /**
   * Remove a friend of a user from the friend list
   *
   * @param id       the user
   * @param username the friend
   */
  void unFriend(int id, String username) throws SQLException;

  /**
   * Count all the friends that a user has
   *
   * @param id the user id
   * @return the number of the friends of a user
   */
  int countFriends(int id);

  /**
   * Sending a friend request to a user2 from user1, put them on the friends table
   *
   * @param id       the id of user1
   * @param username the id of user2
   */
  void sendRequest(int id, String username) throws SQLException;

  /**
   * Make user2 become the friend of user1
   *
   * @param id       id of user1
   * @param username id of user2
   */
  void becomeFriend(int id, String username);

  /**
   * Block user2, who is friend of user1, by user1
   *
   * @param id       the id of user1
   * @param username the id of user2
   */
  void blockFriend(int id, String username);

}