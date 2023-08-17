package com.yagiz.carservice.business.dto.reponses.create;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CreateBrandResponse {
    private UUID brandId;
    private String brandName;
}
