package com.yagiz.groupingservice.business.rules;

import org.springframework.stereotype.Service;

import com.yagiz.commonservice.exceptionUtils.constants.Messages;
import com.yagiz.commonservice.exceptionUtils.exceptions.BusinessException;
import com.yagiz.groupingservice.repository.GroupRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class GroupBusinessRules {
    private GroupRepository repository;

    public void checkIfGroupIdNotExists(int id){
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
