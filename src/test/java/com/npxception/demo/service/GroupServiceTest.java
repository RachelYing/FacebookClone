package com.npxception.demo.service;

import com.npxception.demo.dao.PostgreSQLGroupDaoImpl;
import com.npxception.demo.entity.FbGroup;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class GroupServiceTest {
  private GroupService groupService;
  private PostgreSQLGroupDaoImpl postgreSQLGroupDao;

  @Before
  public void setUp() throws Exception {
    postgreSQLGroupDao = Mockito.mock(PostgreSQLGroupDaoImpl.class);
    groupService = new GroupService(postgreSQLGroupDao);
  }

 @Test
  public void GroupTests() throws Exception {
   FbGroup group1 = new FbGroup();
   group1.setGroupID(1);
   group1.setAdmin("1");
   group1.setName("a");
   FbGroup group2 = new FbGroup();
   group2.setGroupID(2);
   group2.setAdmin("2");
   group2.setName("b");

   List<FbGroup> allGroups = new ArrayList<>();
   allGroups.add(group1);
   allGroups.add(group2);

   List<FbGroup> groupOneList = new ArrayList<>();
   groupOneList.add(group1);

   List<FbGroup> groupTwoList = new ArrayList<>();
   groupTwoList.add(group2);

   Mockito.doReturn(group1).when(postgreSQLGroupDao).getGroupById(1);
   Assert.assertEquals(group1, postgreSQLGroupDao.getGroupById(1));

//   Mockito.doReturn(groupOneList).when(postgreSQLGroupDao).getGroupByAdmin(1);
//   Assert.assertEquals(groupOneList, postgreSQLGroupDao.getGroupByAdmin(1));

   Mockito.doReturn(groupTwoList).when(postgreSQLGroupDao).getGroupByAdmin("b");
   Assert.assertEquals(groupTwoList, postgreSQLGroupDao.getGroupByAdmin("b"));

   Mockito.doReturn(groupOneList).when(postgreSQLGroupDao).getGroupByName("a");
   Assert.assertEquals(groupOneList, postgreSQLGroupDao.getGroupByName("a"));

   Mockito.doReturn(allGroups).when(postgreSQLGroupDao).getAllGroup();
   Assert.assertEquals(allGroups, postgreSQLGroupDao.getAllGroup());

   Mockito.doReturn(groupOneList).when(postgreSQLGroupDao).getAllGroupsForUser(1);
   Assert.assertEquals(groupOneList, postgreSQLGroupDao.getAllGroupsForUser(1));

 }

}