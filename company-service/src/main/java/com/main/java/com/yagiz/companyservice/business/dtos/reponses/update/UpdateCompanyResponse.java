package com.main.java.com.yagiz.companyservice.business.dtos.reponses.update;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateCompanyResponse {
    private int id;
    private String name;
    private LocalDate foundation;
}