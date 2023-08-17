package com.yagiz.userservice.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yagiz.userservice.business.abstracts.UserService;
import com.yagiz.userservice.business.dtos.reponses.create.CreateUserResponse;
import com.yagiz.userservice.business.dtos.reponses.get.GetUserListResponse;
import com.yagiz.userservice.business.dtos.reponses.get.GetUserResponse;
import com.yagiz.userservice.business.dtos.reponses.update.UpdateUserResponse;
import com.yagiz.userservice.business.dtos.requests.CreateUserRequest;
import com.yagiz.userservice.business.dtos.requests.UpdateUserRequest;
import com.yagiz.userservice.business.rules.UserBusinessRules;
import com.yagiz.userservice.entity.User;
import com.yagiz.userservice.repository.UserRepository;

import lombok.AllArgsConstructor;
import main.java.com.yagiz.commonservice.Mapper.ModelMapperService;

@Service
@AllArgsConstructor
public class UserManager implements UserService{
    private UserRepository repository;
    private ModelMapperService mapperService;
    private UserBusinessRules rules;

    @Override
    public CreateUserResponse add(CreateUserRequest request) {
        rules.checkIfUserAlreadyExists(request.getUsername());
        User user=mapperService.forRequest().map(request, User.class);
        user.setId(0);
        repository.save(user);
        CreateUserResponse response=mapperService.forResponse().map(user, CreateUserResponse.class);
        return response;
    }

    @Override
    public UpdateUserResponse update(int userId,UpdateUserRequest request) {
        rules.checkIfUserNotExists(userId);
        User user=mapperService.forRequest().map(request, User.class);
        user.setId(userId);
        repository.save(user);
        UpdateUserResponse response=mapperService.forResponse().map(user, UpdateUserResponse.class);
        return response;
    }

    @Override
    public GetUserResponse getById(int id) {
        rules.checkIfUserNotExists(id);
        User user=repository.findById(id).orElseThrow();
        GetUserResponse response=mapperService.forResponse().map(user, GetUserResponse.class);
        return response;
    }

    @Override
    public List<GetUserListResponse> getUserList() {
        List<User> users=repository.findAll();
        List<GetUserListResponse> responses=users.stream()
            .map(user->mapperService.forResponse()
                .map(user, GetUserListResponse.class)).toList();

        return responses;
    }

    @Override
    public void deleteById(int id) {
        rules.checkIfUserNotExists(id);
        repository.deleteById(id);
    }

}
