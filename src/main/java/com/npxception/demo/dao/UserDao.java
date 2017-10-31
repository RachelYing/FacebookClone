package com.npxception.demo.dao;

import com.npxception.demo.entity.User;

import java.util.Collection;

public interface UserDao {
  // need to find a way to let login and register happen first
  Collection<User> getAllUser();

  // Developer methods
  User getUserById(int id);

  void removeUserById(int id);

  void updateUser(User user);

  void insertUserToDb(User user);

  // Client API methods
  Collection<User> getUsersByFirstName(String name);

  Collection<User> getUsersByLastName(String name);

  // As in "First Last" nomenclature
  User getUsersByFullName(String name);

  // As in "first.last" nomenclature
  User getUserByUserName(String name);

  // Email
  User getUserByEmail(String email);

//  User getUserByEmailID(String email, int id);


  // Age
  Collection<User> getUsersByAge(int age);

  // Gender
  Collection<User> getUsersByGender(String gender);

  // Country
  Collection<User> getUsersByCountry(String country);

  // City
  Collection<User> getUserByCity(String city);

  void setFirstName(int userId, String first);

  void setLastName(int userID, String last);

  void setEmail(int userID, String email);

  void setAge(int userID, int age);

  void setGender(int userID, String gender);

  void setCountry(int userID, String country);

  void setCity(int userID, String city);

  void setPassword(int userID, String password);
}