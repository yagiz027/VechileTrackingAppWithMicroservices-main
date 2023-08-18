package com.yagiz.groupingservice.business.abstracts;

import java.util.List;
import java.util.UUID;

import com.yagiz.groupingservice.business.dto.requests.create.CreateGroupRequest;
import com.yagiz.groupingservice.business.dto.requests.update.UpdateGroupRequest;
import com.yagiz.groupingservice.business.dto.responses.create.CreateGroupResponse;
import com.yagiz.groupingservice.business.dto.responses.get.GetGroupById;
import com.yagiz.groupingservice.business.dto.responses.get.GetGroupList;
import com.yagiz.groupingservice.business.dto.responses.update.UpdateGroupResponse;

public interface GroupService {
    GetGroupById getById(UUID id);
    List<GetGroupList> getGroupList();
    CreateGroupResponse addGroup(CreateGroupRequest request);
    UpdateGroupResponse updateGroup(UUID id,UpdateGroupRequest request);
    void deleteById(UUID id);
}
