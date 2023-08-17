package com.main.java.com.yagiz.companyservice.business.dtos.reponses.create;

import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateCompanyResponse {
    private UUID id;
    private String name;
    private LocalDate foundation;
}
