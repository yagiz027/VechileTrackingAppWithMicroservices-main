package com.yagiz.groupingservice.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yagiz.groupingservice.business.abstracts.GroupService;
import com.yagiz.groupingservice.business.dto.requests.create.CreateGroupRequest;
import com.yagiz.groupingservice.business.dto.requests.update.UpdateGroupRequest;
import com.yagiz.groupingservice.business.dto.responses.create.CreateGroupResponse;
import com.yagiz.groupingservice.business.dto.responses.get.GetGroupById;
import com.yagiz.groupingservice.business.dto.responses.get.GetGroupList;
import com.yagiz.groupingservice.business.dto.responses.update.UpdateGroupResponse;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "api/groups")
@AllArgsConstructor
public class GroupController {
    private GroupService service;

    @GetMapping("/{id}")
    public GetGroupById getById(@PathVariable int id){
        return service.getById(id);
    }

    @GetMapping
    public List<GetGroupList> getGroupList(){
        return service.getGroupList();
    }

    @PostMapping
    public CreateGroupResponse addGroup(@RequestBody CreateGroupRequest request){
        return service.addGroup(request);
    }

    @PutMapping("/{id}")
    public UpdateGroupResponse updateGroup(@PathVariable int id, @RequestBody UpdateGroupRequest request){
        return service.updateGroup(id, request);
    }

    @DeleteMapping 
    public void deleteById(@PathVariable int id){
        service.deleteById(id);
    }
}
