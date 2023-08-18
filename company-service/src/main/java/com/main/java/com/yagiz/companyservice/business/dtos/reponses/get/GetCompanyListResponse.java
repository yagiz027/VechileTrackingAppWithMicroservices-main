package com.main.java.com.yagiz.companyservice.business.dtos.reponses.get;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetCompanyListResponse {
    private int id;
    private String name;
    private LocalDate foundation;
}
