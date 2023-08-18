package com.yagiz.groupingservice.business.dto.responses.update;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateGroupResponse {
    private int id;
    private String name;
    private String userName;
    private String userSurname;
    private String groupName;
    private String carPlate;  
}
