package com.yagiz.groupingservice.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yagiz.groupingservice.business.abstracts.GroupService;
import com.yagiz.groupingservice.business.dto.requests.create.CreateGroupRequest;
import com.yagiz.groupingservice.business.dto.requests.update.UpdateGroupRequest;
import com.yagiz.groupingservice.business.dto.responses.create.CreateGroupResponse;
import com.yagiz.groupingservice.business.dto.responses.get.GetGroupById;
import com.yagiz.groupingservice.business.dto.responses.get.GetGroupList;
import com.yagiz.groupingservice.business.dto.responses.update.UpdateGroupResponse;
import com.yagiz.groupingservice.business.rules.GroupBusinessRules;
import com.yagiz.groupingservice.entity.Group;
import com.yagiz.groupingservice.repository.GroupRepository;

import lombok.AllArgsConstructor;
import main.java.com.yagiz.commonservice.Mapper.ModelMapperService;

@AllArgsConstructor
@Service
public class GroupManager implements GroupService{
    private ModelMapperService modelMapperService;
    private GroupRepository repository;
    private GroupBusinessRules rules;

    @Override
    public GetGroupById getById(int id) {
        rules.checkIfGroupIdNotExists(id);
        Group group= repository.findById(id).orElseThrow();
        GetGroupById response=modelMapperService.forResponse().map(group, GetGroupById.class);
        return response;
    }
    @Override
    public List<GetGroupList> getGroupList() {
        List<Group> groups=repository.findAll();
        List<GetGroupList> response = groups.stream().map(group-> modelMapperService.forResponse().map(group,GetGroupList.class)).toList();
        return response;
    }
    @Override
    public CreateGroupResponse addGroup(CreateGroupRequest request) {
        rules.checkIfGroupAlreadyExsists(request.getName());
        Group group = modelMapperService.forRequest().map(request, Group.class);
        group.setId(0);

        repository.save(group);
        CreateGroupResponse response = modelMapperService.forResponse().map(group, CreateGroupResponse.class);

        return response;
    }
    @Override
    public UpdateGroupResponse updateGroup(int id, UpdateGroupRequest request) {
        rules.checkIfGroupIdNotExists(id);
        Group group=modelMapperService.forRequest().map(request, Group.class);
        group.setId(id);
        repository.save(group);
        UpdateGroupResponse response=modelMapperService.forResponse().map(group, UpdateGroupResponse.class);

        return response;
    }
    @Override
    public void deleteById(int id) {
        rules.checkIfGroupIdNotExists(id);
        repository.deleteById(id);
    }
}
