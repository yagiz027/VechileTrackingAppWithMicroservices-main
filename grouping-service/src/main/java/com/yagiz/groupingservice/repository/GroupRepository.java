package com.yagiz.groupingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yagiz.groupingservice.entity.Group;

public interface GroupRepository extends JpaRepository<Group,Integer>{

    boolean existsByName(String name);
}
