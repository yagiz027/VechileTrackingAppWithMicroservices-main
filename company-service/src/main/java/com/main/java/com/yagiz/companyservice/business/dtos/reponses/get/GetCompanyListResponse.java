package com.main.java.com.yagiz.companyservice.business.dtos.reponses.get;

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
public class GetCompanyListResponse {
    private UUID id;
    private String name;
    private LocalDate foundation;
}
