package com.yagiz.carservice.business.dto.requests.create;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateCarRequest {
    @NotNull
    private int modelId;
    @NotNull
    private int companyId;
    private String plate;
    private String ChassisNumber;
    private String tag;
}
