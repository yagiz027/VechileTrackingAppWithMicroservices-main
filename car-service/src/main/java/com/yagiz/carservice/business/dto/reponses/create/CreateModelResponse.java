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
public class CreateModelResponse {
    private UUID modelId;
    private UUID brandId;
    private String modelName;
    private int modelYear;
}
