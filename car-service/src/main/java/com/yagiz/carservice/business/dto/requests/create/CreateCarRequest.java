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
    private String plate;
    private String ChassisNumber;
    private String tag;
    @NotNull
    private UUID modelId;
}
