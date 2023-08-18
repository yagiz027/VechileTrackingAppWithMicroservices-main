package com.yagiz.groupingservice.business.rules;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.yagiz.exceptionservice.utils.constants.Messages;
import com.yagiz.exceptionservice.utils.exceptions.BusinessException;
import com.yagiz.groupingservice.repository.AreaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class AreaBusinessRules {
    private AreaRepository repository;
    
    public void checkIfAreaNotExists(UUID id){
        if(!repository.existsById(id)){
            throw new BusinessException(Messages.Area.NotExists);
        }
    }

    public void checkIfAreaAlreadyExists(String name){
        if(repository.existsByName(name)){
            throw new BusinessException(Messages.Area.AlreadyExists);
        }
    }
}
