package com.yagiz.carservice.business.rules;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.yagiz.carservice.repository.ModelRepository;
import com.yagiz.exceptionservice.utils.constants.Messages;
import com.yagiz.exceptionservice.utils.exceptions.BusinessException;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ModelBusinessRules {
    private ModelRepository repository;

    public void checkIfModelAlreadyExists(UUID modelId){
        if(repository.existsById(modelId)){
            throw new BusinessException(Messages.Model.AlreadyExists);
        }
    }

    public void checkIfModelNotExsist(UUID modelId){
        if(!repository.existsById(modelId)){
            throw new BusinessException(Messages.Model.NotExists);
        }
    }
}