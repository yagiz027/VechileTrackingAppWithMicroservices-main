package com.yagiz.carservice.business.dto.requests.create;

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
public class CreateModelRequest {
    @Size(min=2,max=20)
    private String name;
    private int modelYear;
    @NotNull
    private UUID brandId;
}
