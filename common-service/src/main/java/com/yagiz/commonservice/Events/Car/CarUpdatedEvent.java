package com.yagiz.commonservice.Events.Car;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CarUpdatedEvent {
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
