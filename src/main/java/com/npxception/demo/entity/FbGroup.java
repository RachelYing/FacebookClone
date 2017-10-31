package com.npxception.demo.entity;

public class FbGroup {
  private int groupid;
  private String groupadmin;
  private String groupname;


  /**
   * Constructor for a facebook group.
   * // * @param groupid The group's group id in the database
   *
   * @param groupadmin The group's groupadmin id in the database
   * @param name       The group's name in the database
   */
  // public FbGroup(int groupid, String groupadmin, String name) {
  public FbGroup(String groupadmin, String name) {

//      this.groupid = groupid;
    this.groupadmin = groupadmin;
    this.groupname = name;
  }

  public FbGroup() {
  }

  /**
   * Getter for group's ID in the database.
   *
   * @return group's ID in the database
   */
  public int getGroupID() {
    return groupid;
  }

  /**
   * Setter for group's ID in the database.
   *
   * @param groupid The group's group id in the database
   */
  public void setGroupID(int groupid) {
    this.groupid = groupid;
  }

  /**
   * Getter for group's groupadmin id in the database.
   *
   * @return group's groupadmin id in the database
   */
  public String getAdmin() {
    return groupadmin;
  }

  /**
   * Setter for group's groupadmin id in the database.
   *
   * @param groupadmin The group's groupadmin id in the database
   */
  public void setAdmin(String groupadmin) {
    this.groupadmin = groupadmin;
  }

  /**
   * Getter for group's name in the database.
   *
   * @return group's name in the database
   */
  public String getName() {
    return groupname;
  }

  /**
   * Setter for group's name in the database.
   *
   * @param name The group's name in the database
   */
  public void setName(String name) {
    this.groupname = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    FbGroup fbGroup = (FbGroup) o;

    if (groupid != fbGroup.groupid) return false;
    if (getAdmin() != null ? !getAdmin().equals(fbGroup.getAdmin()) : fbGroup.getAdmin() != null)
      return false;
    return groupname != null ? groupname.equals(fbGroup.groupname) : fbGroup.groupname == null;
  }

  @Override
  public int hashCode() {
    int result = groupid;
    result = 31 * result + (getAdmin() != null ? getAdmin().hashCode() : 0);
    result = 31 * result + (groupname != null ? groupname.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "FbGroup{" +
        "groupid=" + groupid +
        ", groupadmin=" + groupadmin +
        ", groupname='" + groupname + '\'' +
        '}';
  }
}