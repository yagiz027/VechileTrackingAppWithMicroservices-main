package com.yagiz.carservice.business.dto.reponses.create;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateCarResponse {
    private UUID carId;
    private UUID modelId;
    private String carPlate;   
    private String ChassisNumber;
    private String tag;
}
