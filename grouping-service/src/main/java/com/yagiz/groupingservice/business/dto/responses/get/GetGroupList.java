package com.yagiz.groupingservice.business.dto.responses.get;

import java.util.List;
import java.util.UUID;

import com.yagiz.exceptionservice.utils.constants.Messages.Group;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetGroupList {
    private UUID groupId;
    private String groupName;
    private List<Group> subGroups;
}
