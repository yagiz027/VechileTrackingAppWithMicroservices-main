package com.main.java.com.yagiz.companyservice.business.kafka.consumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.main.java.com.yagiz.companyservice.business.rules.CompanyBusinessRules;
import com.main.java.com.yagiz.companyservice.entity.Company;
import com.main.java.com.yagiz.companyservice.repository.CompanyRepository;
import com.yagiz.carservice.business.abstracts.CarService;
import com.yagiz.commonservice.Events.Car.CarCreatedEvent;
import com.yagiz.commonservice.Events.Car.CarUpdatedEvent;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class CarConsumer {
    private final CarService carService;
    private final CompanyBusinessRules rules;
    private final CompanyRepository repository;

    @KafkaListener(
        topics="car-created",
        groupId="car-service-car-created"
    )
    public void consume(CarCreatedEvent event){
        rules.checkIfCompanyNotExists(event.getCompanyId());
        Company company=repository.findById(event.getCompanyId()).orElseThrow();
        carService.changeResponseCompanyName(company.getName());
        log.info("Car created events consumed {}",event);
    }

    @KafkaListener(
        topics="car-updated",
        groupId="car-service-car-updated"
    )
    public void consume(CarUpdatedEvent event){
        rules.checkIfCompanyNotExists(event.getCompanyId());
        Company company=repository.findById(event.getCompanyId()).orElseThrow();
        carService.changeResponseCompanyName(company.getName());
        log.info("Car updated events consumed {}",event);
    }
}
