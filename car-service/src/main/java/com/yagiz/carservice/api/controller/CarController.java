package com.yagiz.carservice.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.yagiz.carservice.business.abstracts.CarService;
import com.yagiz.carservice.business.dto.reponses.create.CreateCarResponse;
import com.yagiz.carservice.business.dto.reponses.get.GetCarListResponse;
import com.yagiz.carservice.business.dto.reponses.get.GetCarResponse;
import com.yagiz.carservice.business.dto.reponses.update.UpdateCarResponse;
import com.yagiz.carservice.business.dto.requests.create.CreateCarRequest;
import com.yagiz.carservice.business.dto.requests.update.UpdateCarRequest;

import lombok.AllArgsConstructor;


@RestController
@RequestMapping(value = "api/cars")
@AllArgsConstructor
public class CarController {
    private final CarService carService;

    @GetMapping
    public List<GetCarListResponse> getCarList() {
        return carService.getCarList();
    }

    @GetMapping("/{carId}")
    public GetCarResponse getCarById(int carId){
        return carService.getCarById(carId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateCarResponse addCar(@RequestBody CreateCarRequest request) {        
        return carService.add(request);
    }

    @PutMapping("/{carId}")
    @ResponseStatus(HttpStatus.OK)
    public UpdateCarResponse updateCar(@PathVariable int carId, @RequestBody UpdateCarRequest request) {
        return carService.update(carId, request);
    }
    
    @DeleteMapping("/{carId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable int carId) {
        carService.deleteById(carId);
    }
}
