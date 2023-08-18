package com.yagiz.carservice.business.dto.requests.update;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateCarRequest {
    @NotNull
    private UUID modelId;
    @NotNull
    private UUID companyId;
    @NotNull
    private UUID groupId;
    private String plate;
    private String ChassisNumber;
    @Size(min=10,max=100)
    private String tag;
}
