package com.yagiz.carservice.business.rules;

import org.springframework.stereotype.Service;

import com.yagiz.carservice.repository.CarRepository;
import com.yagiz.commonservice.exceptionUtils.constants.Messages;
import com.yagiz.commonservice.exceptionUtils.exceptions.BusinessException;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CarBusinessRules {
    private CarRepository repository;
    
    public void checkIfCarAlreadyExists(int carId){
        if(repository.existsById(carId)){
            throw new BusinessException(Messages.Car.AlreadyExsists);
        }
    }

    public void checkIfCarNotFound(int carId){
        if(!repository.existsById(carId)){
            throw new BusinessException(Messages.Car.NotFound);
        }
    }
}

