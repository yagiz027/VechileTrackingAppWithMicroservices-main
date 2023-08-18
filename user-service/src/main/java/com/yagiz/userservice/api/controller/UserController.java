package com.yagiz.userservice.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.yagiz.userservice.business.abstracts.UserService;
import com.yagiz.userservice.business.dtos.reponses.create.CreateUserResponse;
import com.yagiz.userservice.business.dtos.reponses.get.GetUserListResponse;
import com.yagiz.userservice.business.dtos.reponses.get.GetUserResponse;
import com.yagiz.userservice.business.dtos.reponses.update.UpdateUserResponse;
import com.yagiz.userservice.business.dtos.requests.CreateUserRequest;
import com.yagiz.userservice.business.dtos.requests.UpdateUserRequest;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "api/users")
@AllArgsConstructor
public class UserController {
    private UserService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateUserResponse add(CreateUserRequest request){
        return service.add(request);
    }

    @PutMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public UpdateUserResponse update(int userId,UpdateUserRequest request){
        return service.update(userId,request);
    }

    @GetMapping
    public List<GetUserListResponse> getUserList(){
        return service.getUserList();
    }

    @GetMapping("/{userId}")
    public GetUserResponse getById(int userId){
        return service.getById(userId);
    }

    @DeleteMapping("/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(int userId){
        service.deleteById(userId);
    }
}
