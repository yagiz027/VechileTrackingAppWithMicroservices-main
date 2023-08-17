package com.yagiz.carservice.business.rules;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.yagiz.carservice.repository.CarRepository;
import com.yagiz.exceptionservice.utils.constants.Messages;
import com.yagiz.exceptionservice.utils.exceptions.BusinessException;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CarBusinessRules {
    private CarRepository repository;
    
    public void checkIfCarAlreadyExists(UUID carId){
        if(repository.existsById(carId)){
            throw new BusinessException(Messages.Car.AlreadyExsists);
        }
    }

    public void checkIfCarNotFound(UUID carId){
        if(!repository.existsById(carId)){
            throw new BusinessException(Messages.Car.NotFound);
        }
    }
}

