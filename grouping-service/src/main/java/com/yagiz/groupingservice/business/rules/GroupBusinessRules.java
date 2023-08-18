package com.yagiz.groupingservice.business.rules;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.yagiz.exceptionservice.utils.constants.Messages;
import com.yagiz.exceptionservice.utils.exceptions.BusinessException;
import com.yagiz.groupingservice.repository.GroupRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class GroupBusinessRules {
    private GroupRepository repository;

    public void checkIfGroupIdNotExists(UUID id){
        if(!repository.existsById(id)){
            throw new BusinessException(Messages.Group.NotExists);
        }
    }

    public void checkIfGroupAlreadyExsists(String name){
        if(repository.existsByName(name)){
            throw new BusinessException(Messages.Group.AlreadyExists);
        }
    }
}