package com.yagiz.groupingservice.business.dto.responses.create;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateGroupResponse {
    private int id;
    private String provinceName;
    private String areaName;
    private String name;
    private String carPlate;
}
