package com.npxception.demo.service;

import com.npxception.demo.dao.GroupDao;
import com.npxception.demo.dao.PostgreSQLGroupDaoImpl;
import com.npxception.demo.entity.FbGroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;


/**
 * Service class for group.
 */

@Service
public class GroupService {
  PostgreSQLGroupDaoImpl postgreSQLGroupDao;


  GroupService(PostgreSQLGroupDaoImpl postgreSQLGroupDao) {
    this.postgreSQLGroupDao = postgreSQLGroupDao;
  }


  @Autowired
  @Qualifier("PostgresGroupRepo")
  private GroupDao groupDao;

  public Collection<FbGroup> getAllGroup() {
    return this.groupDao.getAllGroup();
  }


  public FbGroup getGroupById(int id) {

    return this.groupDao.getGroupById(id);
  }

  public void removeGroupById(int id) {
    this.groupDao.removeGroupById(id);
  }


  public void createGroup(FbGroup fbGroup) {
    this.groupDao.createGroup(fbGroup);
  }


  public Collection<FbGroup> getGroupByName(String name) {
    return this.groupDao.getGroupByName(name);
  }

  public Collection<FbGroup> getGroupByAdmin(String admin) {
    return this.groupDao.getGroupByAdmin(admin);
  }

  public Collection<FbGroup> getAllGroupsForUser(int memberid) {
    return this.groupDao.getAllGroupsForUser(memberid);
  }

  public void sendJoinRequest(int groupid, int memberid) {
    this.groupDao.sendJoinRequest(groupid, memberid);
  }

  public void addMemberToGroup(int userid, int groupid, int memberid) {
    this.groupDao.addMemberToGroup(userid, groupid, memberid);
  }

  public void removeMemberFromGroup(int userid, int groupid, int memberid) {
    this.groupDao.removeMemberFromGroup(userid, groupid, memberid);
  }


}
