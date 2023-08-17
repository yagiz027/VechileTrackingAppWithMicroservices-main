package com.yagiz.groupingservice.entity;

import java.util.List;
import java.util.UUID;

import com.yagiz.exceptionservice.utils.constants.Messages.Car;

public class Group {
    private UUID id;
    private UUID companyId;
    private String name;
    private List<Car> cars;
}
