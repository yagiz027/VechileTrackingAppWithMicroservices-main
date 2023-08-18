package com.yagiz.userservice.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yagiz.userservice.entity.User;


public interface UserRepository extends JpaRepository<User,UUID>{
    boolean existsByUsername(String username);
}
