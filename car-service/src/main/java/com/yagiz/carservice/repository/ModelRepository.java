package com.yagiz.carservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yagiz.carservice.entities.Model;

public interface ModelRepository extends JpaRepository<Model,Integer>{
    
}
