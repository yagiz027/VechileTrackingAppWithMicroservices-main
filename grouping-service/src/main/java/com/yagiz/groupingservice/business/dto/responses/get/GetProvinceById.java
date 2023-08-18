package com.yagiz.groupingservice.business.dto.responses.get;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetProvinceById {
    private UUID id;
    private String name;
    private int postalCode;
}
