package com.yagiz.groupingservice.business.dto.requests.create;

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
public class CreateGroupRequest {
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
