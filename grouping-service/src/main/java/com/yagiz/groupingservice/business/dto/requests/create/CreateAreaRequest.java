package com.yagiz.groupingservice.business.dto.requests.create;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateAreaRequest {
    private UUID id;
    private String name;
    private int postalCode;
}
