package com.yagiz.groupingservice.business.rules;

import org.springframework.stereotype.Service;

import com.yagiz.commonservice.exceptionUtils.constants.Messages;
import com.yagiz.commonservice.exceptionUtils.exceptions.BusinessException;
import com.yagiz.groupingservice.repository.AreaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class AreaBusinessRules {
    private AreaRepository repository;
    
    public void checkIfAreaNotExists(int id){
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
