package com.yagiz.carservice.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yagiz.carservice.entities.Brand;


public interface BrandRepository extends JpaRepository<Brand,UUID> {
}
