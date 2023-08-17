package com.main.java.com.yagiz.companyservice.business.dtos.requests;

import java.time.LocalDate;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateCompanyRequest {
    @Length(min=10,max=100)
    private String name;
    private LocalDate foundation;
}
