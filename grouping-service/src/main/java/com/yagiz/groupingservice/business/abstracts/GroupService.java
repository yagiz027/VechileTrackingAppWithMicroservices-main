package com.yagiz.groupingservice.business.abstracts;

import java.util.List;

import com.yagiz.groupingservice.business.dto.requests.create.CreateGroupRequest;
import com.yagiz.groupingservice.business.dto.requests.update.UpdateGroupRequest;
import com.yagiz.groupingservice.business.dto.responses.create.CreateGroupResponse;
import com.yagiz.groupingservice.business.dto.responses.get.GetGroupById;
import com.yagiz.groupingservice.business.dto.responses.get.GetGroupList;
import com.yagiz.groupingservice.business.dto.responses.update.UpdateGroupResponse;
import com.yagiz.groupingservice.entity.Group;

public interface GroupService {
    GetGroupById getById(int id);
    List<GetGroupList> getGroupList();
    CreateGroupResponse addGroup(CreateGroupRequest request);
    UpdateGroupResponse updateGroup(int id,UpdateGroupRequest request);
    void deleteById(int id);
    Group getGroupByRequestId(int id);
}
