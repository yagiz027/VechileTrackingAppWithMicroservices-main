package com.yagiz.carservice.business.dto.reponses.create;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CreateBrandResponse {
    private int brandId;
    private String brandName;
}
