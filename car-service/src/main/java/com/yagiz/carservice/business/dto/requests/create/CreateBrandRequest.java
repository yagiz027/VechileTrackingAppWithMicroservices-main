package com.yagiz.carservice.business.dto.requests.create;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class CreateBrandRequest {
    @Size(min=3,max=20)
    private String name;
}
