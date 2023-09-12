package com.yagiz.carservice.business.concretes;

import java.util.List;

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
import com.yagiz.commonservice.Events.Car.CarCreatedEvent;
import com.yagiz.commonservice.Mapper.ModelMapperService;
import com.yagiz.commonservice.kafka.producer.KafkaProducer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CarManager implements CarService{
    private final CarRepository repository;
    private final CarBusinessRules rules;
    private final ModelMapperService mapperService;
    private final KafkaProducer producer;

    @Override
    public CreateCarResponse add(CreateCarRequest request) {
        var car=mapperService.forRequest().map(request, Car.class);

        car.setId(0);
        var createdCar = repository.save(car);
        sendKafkaCarCreatedEvent(createdCar);  

        var createCarResponse=mapperService.forResponse().map(car, CreateCarResponse.class);
        return createCarResponse;
    }

    @Override
    public UpdateCarResponse update(int carId ,UpdateCarRequest request) {
        rules.checkIfCarNotFound(carId);
        var car=mapperService.forRequest().map(request, Car.class);

        car.setId(carId);
        repository.save(car);
        var updateCarResponse=mapperService.forRequest().map(car,UpdateCarResponse.class);

        return updateCarResponse;
    }

    @Override
    public GetCarResponse getCarById(int id) {
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
    public void deleteById(int id) {
        rules.checkIfCarNotFound(id);
        repository.deleteById(id);
    }

    private void sendKafkaCarCreatedEvent(Car createdCar){
        var event=mapperService.forResponse().map(createdCar, CarCreatedEvent.class);
        producer.sendMessage(event,"car-created" );
    }
}
