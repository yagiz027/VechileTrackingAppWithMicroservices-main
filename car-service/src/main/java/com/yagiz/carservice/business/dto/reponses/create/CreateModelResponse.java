package com.yagiz.carservice.business.dto.reponses.create;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateModelResponse {
    private int modelId;
    private int brandId;
    private String modelName;
    private int modelYear;
}
