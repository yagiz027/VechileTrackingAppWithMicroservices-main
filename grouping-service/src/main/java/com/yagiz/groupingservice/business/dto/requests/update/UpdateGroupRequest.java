package com.yagiz.groupingservice.business.dto.requests.update;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateGroupRequest {
    @NotNull
    private String name;
    @NotBlank
    @NotNull
    private UUID provinceId;
    @NotBlank
    @NotNull
    private UUID areaId;
    @NotBlank
    @NotNull
    private UUID groupId;
}
