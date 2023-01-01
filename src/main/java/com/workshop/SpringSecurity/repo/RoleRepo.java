package com.workshop.SpringSecurity.repo;

import com.workshop.SpringSecurity.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
