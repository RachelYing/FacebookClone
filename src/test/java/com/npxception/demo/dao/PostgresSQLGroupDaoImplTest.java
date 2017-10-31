package com.npxception.demo.dao;

import com.npxception.demo.entity.FbGroup;
import com.npxception.demo.service.GroupService;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(PostgreSQLGroupDaoImpl.class)

public class PostgresSQLGroupDaoImplTest {
  @MockBean
  private GroupService groupService;
  @Autowired
  private MockMvc mockMvc;
  private PostgreSQLGroupDaoImpl postgresSQLGroupDao;
  private UserDao userDao;
  private GroupDao groupDao;

  @Before
  public void setUp() throws Exception {
    userDao = Mockito.mock(UserDao.class);
    groupDao = Mockito.mock(GroupDao.class);
    postgresSQLGroupDao = new PostgreSQLGroupDaoImpl();

  }

  @Test
  public void getGroupById() throws Exception {
    FbGroup mockGroup = new FbGroup();
    mockGroup.setAdmin("1");
    mockGroup.setGroupID(2);
    mockGroup.setName("jafdls");

    FbGroup mockGroup2 = new FbGroup();
    mockGroup2.setAdmin("2");
    mockGroup2.setGroupID(3);
    mockGroup2.setName("fsadjkl");


    List<FbGroup> list = new ArrayList<>();
    list.add(mockGroup);
    list.add(mockGroup2);

    Assert.assertEquals(mockGroup, postgresSQLGroupDao.getGroupById(1));
    Mockito.doReturn(mockGroup).when(postgresSQLGroupDao).getGroupById(2);
    Assert.assertEquals(mockGroup, postgresSQLGroupDao.getGroupById(1));





  }

}