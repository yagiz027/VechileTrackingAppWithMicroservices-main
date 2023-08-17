package com.yagiz.carservice.business.concretes;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.yagiz.carservice.business.abstracts.CarService;
import com.yagiz.carservice.business.dto.reponses.create.CreateCarResponse;
import com.yagiz.carservice.business.dto.reponses.get.GetCarListResponse;
import com.yagiz.carservice.business.dto.reponses.get.GetCarResponse;
import com.yagiz.carservice.business.dto.reponses.update.UpdateCarResponse;
import com.yagiz.carservice.business.dto.requests.create.CreateCarRequest;
import com.yagiz.carservice.business.dto.requests.update.UpdateCarRequest;
import com.yagiz.carservice.business.rules.CarBusinessRules;
import com.yagiz.carservice.entities.Car;
import com.yagiz.carservice.repository.CarRepository;

import lombok.AllArgsConstructor;
import main.java.com.yagiz.commonservice.Mapper.ModelMapperService;

@AllArgsConstructor
@Service
public class CarManager implements CarService{
    private CarRepository repository;
    private CarBusinessRules rules;
    private ModelMapperService mapperService;

    @Override
    public CreateCarResponse add(CreateCarRequest request) {
        var car=mapperService.forRequest().map(request, Car.class);
        car.setCarId(UUID.randomUUID());
        repository.save(car);
        var response=mapperService.forResponse().map(car, CreateCarResponse.class);
        return response;
    }

    @Override
    public UpdateCarResponse update(UUID carId ,UpdateCarRequest request) {
        rules.checkIfCarNotFound(carId);
        var car=mapperService.forRequest().map(request, Car.class);
        car.setCarId(carId);
        repository.save(car);
        var response=mapperService.forRequest().map(car,UpdateCarResponse.class);
        return response;
    }

    @Override
    public GetCarResponse getCarById(UUID id) {
        rules.checkIfCarNotFound(id);
        var car=repository.findById(id).orElseThrow();
        var response=mapperService.forResponse().map(car,GetCarResponse.class);
        return response;
    }

    @Override
    public List<GetCarListResponse> getCarList() {
        List<Car> carList=repository.findAll();
        List<GetCarListResponse> response=carList.stream().map(car-> this.mapperService.forResponse().map(car, GetCarListResponse.class)).toList();
        return response;
    }

    @Override
    public void deleteById(UUID id) {
        rules.checkIfCarNotFound(id);
        repository.deleteById(id);
    }
}
