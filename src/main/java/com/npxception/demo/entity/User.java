package com.npxception.demo.entity;

public class User {
  private int userid;
  private String firstname;
  private String lastname;
  private String email;
  private int age;
  private String gender;
  private String country;
  private String city;
  private String password;
  private String role;

  public User(String firstname, String lastname, String email,
              int age, String gender, String country, String city,
              String password, String role) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.email = email;
    this.age = age;
    this.gender = gender;
    this.country = country;
    this.city = city;
    this.password = password;
    this.role = "USER";
  }

  public User() {
  }

  public int getId() {
    return userid;
  }

  public void setId(int userid) {
    this.userid = userid;
  }

  public String getFirstName() {
    return firstname;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setFirstName(String firstname) {
    this.firstname = firstname;
  }

  public String getLastName() {
    return lastname;
  }

  public void setLastName(String lastname) {
    this.lastname = lastname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getPassword() {
    return this.password;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "User{" +
        "userid=" + userid +
        ", firstName='" + firstname + '\'' +
        ", lastName='" + lastname + '\'' +
        ", email='" + email + '\'' +
        ", age=" + age +
        ", gender='" + gender + '\'' +
        ", country='" + country + '\'' +
        ", city='" + city + '\'' +
        ", password='" + password + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    User user = (User) o;

    if (userid != user.userid) return false;
    if (age != user.age) return false;
    if (firstname != null ? !firstname.equals(user.firstname) : user.firstname != null)
      return false;
    if (lastname != null ? !lastname.equals(user.lastname) : user.lastname != null) return false;
    if (email != null ? !email.equals(user.email) : user.email != null) return false;
    if (gender != null ? !gender.equals(user.gender) : user.gender != null) return false;
    if (country != null ? !country.equals(user.country) : user.country != null) return false;
    if (city != null ? !city.equals(user.city) : user.city != null) return false;
    return password != null ? password.equals(user.password) : user.password == null;
  }

  @Override
  public int hashCode() {
    int result = userid;
    result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
    result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
    result = 31 * result + (email != null ? email.hashCode() : 0);
    result = 31 * result + age;
    result = 31 * result + (gender != null ? gender.hashCode() : 0);
    result = 31 * result + (country != null ? country.hashCode() : 0);
    result = 31 * result + (city != null ? city.hashCode() : 0);
    result = 31 * result + (password != null ? password.hashCode() : 0);
    return result;
  }

}