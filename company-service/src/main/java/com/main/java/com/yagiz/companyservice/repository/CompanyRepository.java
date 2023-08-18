package com.main.java.com.yagiz.companyservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.java.com.yagiz.companyservice.entity.Company;

public interface CompanyRepository extends JpaRepository<Company,Integer>{
    boolean existsByName(String name);
}
