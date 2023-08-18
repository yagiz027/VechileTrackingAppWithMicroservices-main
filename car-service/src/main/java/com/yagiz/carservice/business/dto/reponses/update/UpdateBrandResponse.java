package com.yagiz.carservice.business.dto.reponses.update;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateBrandResponse {
    private int brandId;
    private String brandName;
}
