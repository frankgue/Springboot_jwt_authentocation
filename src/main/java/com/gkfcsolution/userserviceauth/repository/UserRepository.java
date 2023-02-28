package com.gkfcsolution.userserviceauth.repository;

import com.gkfcsolution.userserviceauth.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
