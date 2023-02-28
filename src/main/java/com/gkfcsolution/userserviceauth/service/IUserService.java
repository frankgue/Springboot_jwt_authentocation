package com.gkfcsolution.userserviceauth.service;

import com.gkfcsolution.userserviceauth.domain.Role;
import com.gkfcsolution.userserviceauth.domain.User;

import java.util.List;

public interface IUserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
