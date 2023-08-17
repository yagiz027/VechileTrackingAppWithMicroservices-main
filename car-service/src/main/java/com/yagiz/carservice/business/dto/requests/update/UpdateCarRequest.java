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
public class UpdateCarRequest {
    private UUID modelId;
    private String plate;
    private String ChassisNumber;
    @Size(min=10,max=100)
    private String tag;
}
