package com.main.java.com.yagiz.companyservice.business.rules;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.main.java.com.yagiz.companyservice.repository.CompanyRepository;
import com.yagiz.exceptionservice.utils.constants.Messages;
import com.yagiz.exceptionservice.utils.exceptions.BusinessException;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CompanyBusinessRules {
    private CompanyRepository repository;

    public void checkIfCompanyNotExists(UUID id){
        if(!repository.existsById(id)){
            throw new BusinessException(Messages.Company.NotExists);
        }
    }

    public void checkIfCompanyAlreadyExists(String name){
        if(repository.existsByName(name)){
            throw new BusinessException(Messages.Company.AlreadyExsists);
        }
    }
}
