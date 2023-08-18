package com.yagiz.carservice.business.dto.reponses.update;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateModelResponse {
    private int modelId;
    private int brandId;
    private String modelName;
    private int modelYear;
}
