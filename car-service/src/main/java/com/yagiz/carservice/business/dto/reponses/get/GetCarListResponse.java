package com.yagiz.carservice.business.dto.reponses.get;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetCarListResponse {
    private UUID carId;
    private String modelName;
    private String companyName;
    private String groupName;
    private String carPlate;   
    private String ChassisNumber;
    private String tag;
}
