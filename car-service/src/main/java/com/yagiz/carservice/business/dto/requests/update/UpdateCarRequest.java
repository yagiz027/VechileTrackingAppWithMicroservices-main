package com.yagiz.carservice.business.dto.requests.update;

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
    private int modelId;
    @NotNull
    private int companyId;
    @NotNull
    private int groupId;
    private String plate;
    private String ChassisNumber;
    @Size(min=10,max=100)
    private String tag;
}
