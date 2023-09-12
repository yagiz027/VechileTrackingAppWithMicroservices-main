package com.yagiz.groupingservice.business.dto.responses.get;

import java.util.List;

import com.yagiz.groupingservice.entity.Group;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetGroupList {
    private int groupId;
    private String groupName;
    private List<Group> subGroups;
}
