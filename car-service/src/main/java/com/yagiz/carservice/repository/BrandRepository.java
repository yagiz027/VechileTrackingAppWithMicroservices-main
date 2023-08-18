package com.yagiz.carservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yagiz.carservice.entities.Brand;


public interface BrandRepository extends JpaRepository<Brand,Integer> {
}
