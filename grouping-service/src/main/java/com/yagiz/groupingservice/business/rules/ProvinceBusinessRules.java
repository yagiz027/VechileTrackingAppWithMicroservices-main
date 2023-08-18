package com.yagiz.groupingservice.business.rules;

import org.springframework.stereotype.Service;

import com.yagiz.exceptionservice.utils.constants.Messages;
import com.yagiz.exceptionservice.utils.exceptions.BusinessException;
import com.yagiz.groupingservice.repository.ProvinceRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ProvinceBusinessRules {
    private ProvinceRepository repository;
    
    public void checkIfProvinceNotExists(int id){
        if(!repository.existsById(id)){
            throw new BusinessException(Messages.Province.NotExists);
        }
    }
}
