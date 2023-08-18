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
public class UpdateModelRequest {
    @NotNull
    private int brandId;

    @Size(min=3,max=20)
    private String name; //entityName olarak yazıldığında modelMapper bunu girilen id'ye karşılık gelen model in name'i olarak algılamaktadır.
    private int year;
}
