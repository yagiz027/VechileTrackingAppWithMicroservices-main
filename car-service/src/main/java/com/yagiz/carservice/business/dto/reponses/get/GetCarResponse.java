package com.yagiz.carservice.business.dto.reponses.get;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetCarResponse {
    private int carId;
    private String companyName;
    private String groupName;
    private String carPlate;   
    private String ChassisNumber;
    private String tag;
}
