package com.yagiz.carservice.business.rules;

import org.springframework.stereotype.Service;

import com.yagiz.carservice.repository.BrandRepository;
import com.yagiz.commonservice.exceptionUtils.constants.Messages;
import com.yagiz.commonservice.exceptionUtils.exceptions.BusinessException;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BrandBusinessRules {
    private BrandRepository repository;

    public void checkIfBrandNotExists(int brandId){
        if(!repository.existsById(brandId)){
            throw new BusinessException(Messages.Brand.NotExists);
        }
    }
}