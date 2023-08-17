package com.yagiz.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yagiz.userservice.entity.User;


public interface UserRepository extends JpaRepository<User,Integer>{
    boolean existsByUsername(String username);
}
