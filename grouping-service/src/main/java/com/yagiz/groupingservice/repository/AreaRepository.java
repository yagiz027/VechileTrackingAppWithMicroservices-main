package com.yagiz.groupingservice.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yagiz.groupingservice.entity.Area;

public interface AreaRepository extends JpaRepository<Area,UUID>{

    boolean existsByName(String name);
    
}
