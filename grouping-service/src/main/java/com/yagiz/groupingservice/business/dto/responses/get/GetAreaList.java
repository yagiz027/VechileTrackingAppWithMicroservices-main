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
public class GetAreaList {
    private UUID areaId;
    private String areaName;
}
