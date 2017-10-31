package com.npxception.demo.dao;

import com.npxception.demo.entity.Role;

public interface RoleDao {
  /**
   * Find a role based on its name.
   *
   * @param roleid the role name.
   * @return A Role
   */
  Role getRoleById(int roleid);
}