package com.yagiz.groupingservice.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yagiz.groupingservice.entity.Group;

public interface GroupRepository extends JpaRepository<Group,UUID>{

    boolean existsByName(String name);
}
