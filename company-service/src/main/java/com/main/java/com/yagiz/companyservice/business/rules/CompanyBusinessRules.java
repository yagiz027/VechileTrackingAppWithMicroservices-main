package com.main.java.com.yagiz.companyservice.business.rules;

import org.springframework.stereotype.Service;

import com.main.java.com.yagiz.companyservice.repository.CompanyRepository;
import com.yagiz.exceptionservice.utils.constants.Messages;
import com.yagiz.exceptionservice.utils.exceptions.BusinessException;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CompanyBusinessRules {
    private CompanyRepository repository;

    public void checkIfCompanyNotExists(int id){
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
