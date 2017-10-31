package com.npxception.demo.dao;

import com.npxception.demo.entity.User;
import com.npxception.demo.helperMethods.AccessManager;
import com.npxception.demo.helperMethods.UserInformation;
import com.npxception.demo.helperMethods.UserRowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashSet;

import javax.sql.DataSource;

/**
 * Created by RachelDi on 13/06/2017.
 */
@Repository("PostgreFriends")
public class PostgreSQLFriendsDaoImpl implements FriendsDao {

  @Autowired
  private AccessManager accessManager = new AccessManager();

  final String GET_ALL_FRIENDS = "SELECT u.* FROM users u," +
      "friends f  WHERE u.userid = f.usertwoid AND f.useroneid = ? " +
      "AND (f.status = 1 OR f.status = 4)";

  final String REMOVE_ALL_FRIENDS = "DELETE FROM " +
      "friends f WHERE f.useroneid = ? OR f.usertwoid = ?";

  final String UN_FRIENDS = "DELETE FROM friends WHERE useroneid = ? AND usertwoid = ?";

  final String GET_ID_BY_NAME = "SELECT userid FROM users WHERE firstname = ? AND lastname = ?";

  // to avoid more extra space in friends table, I tried to distinguish between sending
  // others invitations and being invited, block a friend and being blocked
  // 2 means request sent, 3 means got invited
  final String SEND_REQUEST = "INSERT INTO friends (useroneid, usertwoid, status) " +
      "SELECT ?, ?, ? WHERE NOT EXISTS (SELECT * FROM friends " +
      "WHERE (useroneid = ? AND usertwoid = ?))";

  final String BECOME_FRIEND = "UPDATE friends SET status = 1 WHERE useroneid = ? " +
      "AND usertwoid = ?";

  final String GET_STATUS = "SELECT status FROM friends WHERE useroneid = ? " +
      "AND usertwoid = ?";

  // 4 means block a friend, 5 means being blocked
  final String BLOCK_FRIEND = "UPDATE friends SET status = ? WHERE useroneid = ? " +
      "AND usertwoid = ?";

  final String GET_FRIEND_BY_NAME = "SELECT u.* FROM users u, friends f " +
      "WHERE u.userid = f.usertwoid AND f.useroneid = ? AND (u.firstname = ? OR u.lastname = ?)";
  final String GET_INVITATION_LIST = "SELECT u.* FROM users u, friends f " +
      "WHERE (u.userid = f.useritwo AND f.useroneid = ? AND f.status = 3)" +
      " OR (u.userid = f.useroneid AND f.usertwoid = ? AND f.status = 2)";

  final String GET_BLOCK_LIST = "SELECT u.* FROM users u, friends f " +
      "WHERE (u.userid = f.usertwoid AND f.useroneid = ? AND f.status = 4)" +
      "OR (u.userid = f.useroneid AND f.usertwoid = ? AND f.status = 5)";

  DataSource ds;

  PostgreSQLFriendsDaoImpl(DataSource ds) {
    this.ds = ds;
  }

  public void create() {
  }

  @Autowired
  private JdbcTemplate jdbcTemplate;

  @Override
  public Collection<User> getAllFriends(int id) {
    return jdbcTemplate.query(GET_ALL_FRIENDS, new UserRowMapper(), id);
  }

  @Override
  public Collection<User> commonFriends(int id, String username) {
    int id2 = getIdByname(username);
    Collection<User> res = new HashSet<>();
    Collection<User> list1 = jdbcTemplate.query(GET_ALL_FRIENDS, new UserRowMapper(), id);
    Collection<User> list2 = jdbcTemplate.query(GET_ALL_FRIENDS, new UserRowMapper(), id2);
    for (User user1 : list1) {
      for (User user2 : list2) {
        if (user1.getId() == user2.getId()) {
          res.add(user1);
        }
      }
    }
    return res;
  }

  @Override
  public Collection<User> getFriendsByName(String username, int id) {
    String[] names = new UserInformation().splitUserNameWithDot(username);

    Collection<User> result = jdbcTemplate.query(GET_FRIEND_BY_NAME, new UserRowMapper(),
        id, names[0], names[0]);
    Collection<User> result2 = jdbcTemplate.query(GET_FRIEND_BY_NAME, new UserRowMapper(),
        id, names[1], names[1]);
    for (User user : result2) {
      result.add(user);
    }
    return result;
  }

  @Override
  public Collection<User> getInvitationList(int id) {
    return jdbcTemplate.query(GET_INVITATION_LIST, new UserRowMapper(), new Object[]{id, id});
  }

  @Override
  public Collection<User> getBlockList(int id) {
    return jdbcTemplate.query(GET_BLOCK_LIST, new UserRowMapper(), new Object[]{id, id});
  }

  @Override
  public void removeAllFriends(int id) {
    jdbcTemplate.update(REMOVE_ALL_FRIENDS, new Object[]{id, id});
  }

  @Override
  public void unFriend(int id, String username) {
    int id2 = getIdByname(username);
    jdbcTemplate.update(UN_FRIENDS, new Object[]{id, id2});
  }

  @Override
  public int countFriends(int id) {
    return getAllFriends(id).size();
  }

  @Override
  public void sendRequest(int id, String username) {
    int id2 = getIdByname(username);
    if (id < id2) {
      jdbcTemplate.update(SEND_REQUEST, new Object[]{id, id2, 2, id, id2,});
    } else {
      jdbcTemplate.update(SEND_REQUEST, new Object[]{id2, id, 3, id2, id});
    }
  }

  @Override
  public void becomeFriend(int id, String username) {
    int id2 = getIdByname(username);
    int currentStatus;
    if (id < id2) {
      currentStatus = jdbcTemplate.queryForObject(GET_STATUS,
          new Object[]{id, id2}, Integer.class);
      // if got invited or block the other
      if ((currentStatus == 3 || currentStatus == 4)) {
        jdbcTemplate.update(BECOME_FRIEND, new Object[]{id, id2});
      }
    } else {
      currentStatus = jdbcTemplate.queryForObject(GET_STATUS,
          new Object[]{id2, id}, Integer.class);
      // this statement means, if id1 is blocked by id2, then id2 has the
      // right to unblock
      if ((currentStatus == 2 || currentStatus == 5)) {
        jdbcTemplate.update(BECOME_FRIEND, new Object[]{id2, id});
      }
    }
  }

  @Override
  public void blockFriend(int id, String username) {
    int id2 = getIdByname(username);
    int currentStatus;
    if (id < id2) {
      currentStatus = jdbcTemplate.queryForObject(GET_STATUS,
          new Object[]{id, id2}, Integer.class);
      if (currentStatus == 1) {
        jdbcTemplate.update(BLOCK_FRIEND, new Object[]{4, id, id2});
      }
    } else {
      currentStatus = jdbcTemplate.queryForObject(GET_STATUS,
          new Object[]{id2, id}, Integer.class);
      if (currentStatus == 1) {
        jdbcTemplate.update(BLOCK_FRIEND, new Object[]{5, id2, id});
      }
    }
  }

  public int getIdByname(String name) {
    String[] result = new UserInformation().splitUserNameWithDot(name);
    return jdbcTemplate.queryForObject(GET_ID_BY_NAME,
        new Object[]{result[0], result[1]}, Integer.class);
  }
}
