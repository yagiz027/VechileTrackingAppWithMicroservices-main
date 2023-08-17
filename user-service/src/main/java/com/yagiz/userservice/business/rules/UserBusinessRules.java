package com.yagiz.userservice.business.rules;

import org.springframework.stereotype.Service;

import com.yagiz.exceptionservice.utils.constants.Messages;
import com.yagiz.exceptionservice.utils.exceptions.BusinessException;
import com.yagiz.userservice.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserBusinessRules {
    private UserRepository repository;

    public void checkIfUserNotExists(int id){
        if(!repository.existsById(id)){
            throw new BusinessException(Messages.User.NotExists);
        }
    }

    public void checkIfUserAlreadyExists(String username){
        if(repository.existsByUsername(username)){
            throw new BusinessException(Messages.User.AlreadyExsists);
        }
    }
}
