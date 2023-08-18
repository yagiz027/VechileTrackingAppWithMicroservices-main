package com.yagiz.carservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yagiz.carservice.entities.Car;

public interface CarRepository extends JpaRepository<Car,Integer>{
}
