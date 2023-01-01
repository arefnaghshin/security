package com.workshop.SpringSecurity.service;

import com.workshop.SpringSecurity.domain.Role;
import com.workshop.SpringSecurity.domain.User;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username,String roleName);


}
