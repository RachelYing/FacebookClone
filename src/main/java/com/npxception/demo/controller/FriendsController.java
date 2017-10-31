package com.npxception.demo.controller;

import com.npxception.demo.entity.User;
import com.npxception.demo.exceptions.ResourceNotFoundException;
import com.npxception.demo.helperMethods.AccessManager;

import com.npxception.demo.service.FriendsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Represents a controller for the Friends Service.
 */
@RestController
@RequestMapping("/{userid}/friend")
@Api(description = "Friends Controller")
public class FriendsController {
  @Autowired
  private FriendsService service;

  @Autowired
  private AccessManager accessManager = new AccessManager();

  @ApiOperation(value = "Return every friend given friend ID")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Successfully retrieved every friend"),
      @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
      @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
  })
  @RequestMapping(value = "/all",
      method = RequestMethod.GET)
  public Collection<User> getAllFriends(@ApiParam(value = "User ID", required = true)
                                        @PathVariable("userid") int id,
                                        @RequestHeader("authorization") String token) {
    accessManager.checkUser(id, token);
    return service.getAllFriends(id);
  }

  @ApiOperation(value = "Removes every friend given user ID")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Successfully removed every friend"),
      @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
      @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
      @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
  })
  //consumes = MediaType.APPLICATION_JSON_VALUE --- just for future reference, maybe I will need this
  @RequestMapping(value = "/all",
      method = RequestMethod.DELETE)
  public void removeAllFriends(@ApiParam(value = "User ID", required = true)
                               @PathVariable("userid") int id,
                               @RequestHeader("authorization") String token) {

    accessManager.checkUser(id, token);
    this.service.removeAllFriends(id);
  }

  @ApiOperation(value = "Unfriend a user given the username")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Successfully unfriended user"),
      @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
      @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
      @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
  })
  @RequestMapping(value = "/unfriend/{username}/",
      method = RequestMethod.PUT)
  public void unFriend(@ApiParam(value = "User ID", required = true) @PathVariable("userid") int id1,
                       @ApiParam(value = "Username", required = true) @PathVariable("username") String username,
                       @RequestHeader("authorization") String token) {
    accessManager.checkUser(id1, token);
    this.service.unFriend(id1, username);
  }

  @ApiOperation(value = "Counts number of friends given user ID")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Successfully retrieved number of friends"),
      @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
      @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
      @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
  })
  @RequestMapping(value = "/count",
      method = RequestMethod.GET)
  public int countFriends(@ApiParam(value = "User ID", required = true)
                          @PathVariable("userid") int id,
                          @RequestHeader("authorization") String token) {
    try {
      accessManager.checkUser(id, token);
      return this.service.countFriends(id);
    } catch (EmptyResultDataAccessException e) {
      throw new ResourceNotFoundException(Integer.toString(id));
    }
  }

  @ApiOperation(value = "Send a friend request to the given username from the given user ID")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Successfully retrieved list of post"),
      @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
      @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
      @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
  })
  @RequestMapping(value = "/request/{username}/",
      method = RequestMethod.PUT)
  public void sendRequest(@ApiParam(value = "User ID", required = true) @PathVariable("userid") int id1,
                          @ApiParam(value = "Username", required = true) @PathVariable("username") String username,
                          @RequestHeader("authorization") String token) {
    accessManager.checkUser(id1, token);
    this.service.sendRequest(id1, username);
  }

  @ApiOperation(value = "Becomes a friend with given username")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Successfully became friend with another user"),
      @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
      @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
      @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
  })
  // I need to add a slash at the end because without it username (FIRST.LAST )
  // will only be consumed as FIRST only
  @RequestMapping(value = "/accept/{username}/",
      method = RequestMethod.PUT)
  public void becomeFriend(@ApiParam(value = "User ID", required = true) @PathVariable("userid") int id1,
                           @ApiParam(value = "Username", required = true) @PathVariable("username") String username,
                           @RequestHeader("authorization") String token) {
    accessManager.checkUser(id1, token);
    this.service.becomeFriend(id1, username);
  }

  @ApiOperation(value = "Block the given username")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Successfully retrieved list of post"),
      @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
      @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
      @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
  })
  @RequestMapping(value = "/block/{username}/",
      method = RequestMethod.PUT)
  public void blockFriend(@ApiParam(value = "User ID", required = true) @PathVariable("userid") int id1,
                          @ApiParam(value = "Username", required = true) @PathVariable("username") String username,
                          @RequestHeader("authorization") String token) {
    accessManager.checkUser(id1, token);
    this.service.blockFriend(id1, username);
  }

  @ApiOperation(value = "Find common friends with given username")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Successfully retrieved list of post"),
      @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
      @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
      @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
  })
  @RequestMapping(value = "/common/{username}/",
      method = RequestMethod.GET)
  public Collection<User> commonFriends(@ApiParam(value = "User ID", required = true) @PathVariable("userid") int id1,
                                        @ApiParam(value = "Username", required = true) @PathVariable("username") String username,
                                        @RequestHeader("authorization") String token) {
    try {
      accessManager.checkUser(id1, token);
      return this.service.commonFriends(id1, username);
    } catch (EmptyResultDataAccessException e) {
      throw new ResourceNotFoundException(Integer.toString(id1), username);
    }
  }

  @ApiOperation(value = "Return every friend with the given username EVEN THOUGH THEY ARE NOT UNIQUE")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Successfully retrieved friend"),
      @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
      @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
      @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
  })
  @RequestMapping(value = "/{username}/",
      method = RequestMethod.GET)
  public Collection<User> getFriendsByName(@ApiParam(value = "Username", required = true) @PathVariable("username") String username,
                                           @ApiParam(value = "User ID", required = true) @PathVariable("userid") int id,
                                           @RequestHeader("authorization") String token) {
    try {
      accessManager.checkUser(id, token);
      return this.service.getFriendsByName(username, id);
    } catch (EmptyResultDataAccessException e) {
      throw new ResourceNotFoundException(username, Integer.toString(id));
    }
  }

  @ApiOperation(value = "Get every friend in invitation list")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Successfully retrieved list of users"),
      @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
      @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
      @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
  })
  @RequestMapping(value = "/pending-invitation",
      method = RequestMethod.GET)
  public Collection<User> getInvitationList(@ApiParam(value = "User ID", required = true)
                                            @PathVariable("userid") int id,
                                            @RequestHeader("authorization") String token) {
    try {
      accessManager.checkUser(id, token);
      return this.service.getInvitationList(id);
    } catch (EmptyResultDataAccessException e) {
      throw new ResourceNotFoundException(Integer.toString(id));
    }
  }

  @ApiOperation(value = "Get every user that is blocked")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Successfully retrieved list of user"),
      @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
      @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
      @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
  })
  @RequestMapping(value = "/blocked",
      method = RequestMethod.GET)
  public Collection<User> getBlockList(@ApiParam(value = "User ID", required = true)
                                       @PathVariable("userid") int id,
                                       @RequestHeader("authorization") String token) {
    try {
      accessManager.checkUser(id, token);
      return this.service.getBlockList(id);
    } catch (EmptyResultDataAccessException e) {
      throw new ResourceNotFoundException(Integer.toString(id));
    }
  }
}
