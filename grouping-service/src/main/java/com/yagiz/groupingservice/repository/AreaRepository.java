package com.yagiz.groupingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yagiz.groupingservice.entity.Area;

public interface AreaRepository extends JpaRepository<Area,Integer>{

    boolean existsByName(String name);
    
}
