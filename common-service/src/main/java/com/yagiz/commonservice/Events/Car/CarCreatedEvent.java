package com.yagiz.commonservice.Events.Car;

import com.yagiz.commonservice.Events.Event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CarCreatedEvent implements Event{
    private int carId;
    private int modelId;
    private int brandID;
    private int companyId;
    private int groupId;
    private int modelYear;
    private String plate;
    private String ChassisNumber;
    private String tag;
}
