package com.yagiz.commonservice.Events.Company;

import com.yagiz.commonservice.Events.Event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FindedCompanyNameByCreatedCarCompanyId implements Event {
    String companyName;
}
