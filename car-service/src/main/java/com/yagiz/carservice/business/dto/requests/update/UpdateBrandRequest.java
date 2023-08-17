package com.yagiz.carservice.business.dto.requests.update;

import java.util.UUID;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateBrandRequest {
    private UUID brandId;
    @Size(min=3,max=20)
    private String brandName;
}
