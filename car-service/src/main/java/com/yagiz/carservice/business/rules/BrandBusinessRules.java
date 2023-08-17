package com.yagiz.carservice.business.rules;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.yagiz.carservice.repository.BrandRepository;
import com.yagiz.exceptionservice.utils.constants.Messages;
import com.yagiz.exceptionservice.utils.exceptions.BusinessException;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BrandBusinessRules {
    private BrandRepository repository;

    public void checkIfBrandNotExists(UUID brandId){
        if(!repository.existsById(brandId)){
            throw new BusinessException(Messages.Brand.NotExists);
        }
    }
}