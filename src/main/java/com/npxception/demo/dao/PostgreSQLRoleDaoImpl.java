package com.npxception.demo.dao;

import com.npxception.demo.entity.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository("PostgreRoleRepo")
public class PostgreSQLRoleDaoImpl implements RoleDao {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  @Override
  public Role getRoleById(int roleid) {
    final String sql = "SELECT * FROM role WHERE roleid = ?";
    Role role = jdbcTemplate.queryForObject(sql, new RoleRowMapper(), roleid);
    return role;
  }

  private static class RoleRowMapper implements RowMapper<Role> {
    @Override
    public Role mapRow(ResultSet resultSet, int i) throws SQLException {
      Role role = new Role();
      role.setRole(resultSet.getString("role"));
      role.setRoleid(resultSet.getInt("roleid"));
      return role;
    }
  }
}