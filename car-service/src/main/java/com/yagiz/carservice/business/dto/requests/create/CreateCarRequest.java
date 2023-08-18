package com.yagiz.carservice.business.dto.requests.create;

import java.util.UUID;

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
    private UUID modelId;
    @NotNull
    private UUID companyId;
    @NotNull
    private UUID groupId;
    private String plate;
    private String ChassisNumber;
    private String tag;
}
