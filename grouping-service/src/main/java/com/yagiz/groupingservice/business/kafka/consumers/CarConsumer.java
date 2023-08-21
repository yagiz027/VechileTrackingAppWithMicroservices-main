package com.yagiz.groupingservice.business.kafka.consumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.yagiz.carservice.business.abstracts.CarService;
import com.yagiz.commonservice.Events.Car.CarCreatedEvent;
import com.yagiz.commonservice.Events.Car.CarUpdatedEvent;
import com.yagiz.groupingservice.business.rules.GroupBusinessRules;
import com.yagiz.groupingservice.entity.Group;
import com.yagiz.groupingservice.repository.GroupRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class CarConsumer {
    private final CarService carService;
    private final GroupRepository repository;
    private final GroupBusinessRules rules;

    @KafkaListener(
        topics="car-created",
        groupId="car-service-car-created"
    )
    public void consume(CarCreatedEvent event){
        rules.checkIfGroupIdNotExists(event.getGroupId());
        Group group=repository.findById(event.getGroupId()).orElseThrow();
        carService.changeResponseGroupName(group.getName());
        log.info("Car created events consumed {}",event);
    }

    @KafkaListener(
        topics="car-updated",
        groupId="car-service-car-updated"
    )
    public void consume(CarUpdatedEvent event){
        rules.checkIfGroupIdNotExists(event.getGroupId());
        Group group=repository.findById(event.getGroupId()).orElseThrow();
        carService.changeResponseGroupName(group.getName());
        log.info("Car updated events consumed {}",event);
    }
}
