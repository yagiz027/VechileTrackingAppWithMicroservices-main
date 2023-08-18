package com.yagiz.groupingservice.business.dto.responses.update;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateGroupResponse {
    private UUID id;
    private String name;
    private String userName;
    private String userSurname;
    private String groupName;
    private String carPlate;
    
}
