package com.gkfcsolution.userserviceauth.repository;

import com.gkfcsolution.userserviceauth.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
