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
public class CarDeletedEvent implements Event{
    private int carId;
}
