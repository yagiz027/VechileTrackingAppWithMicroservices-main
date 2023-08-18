package com.yagiz.userservice.business.abstracts;

import java.util.List;

import com.yagiz.userservice.business.dtos.reponses.create.CreateUserResponse;
import com.yagiz.userservice.business.dtos.reponses.get.GetUserListResponse;
import com.yagiz.userservice.business.dtos.reponses.get.GetUserResponse;
import com.yagiz.userservice.business.dtos.reponses.update.UpdateUserResponse;
import com.yagiz.userservice.business.dtos.requests.CreateUserRequest;
import com.yagiz.userservice.business.dtos.requests.UpdateUserRequest;

public interface UserService {
    CreateUserResponse add(CreateUserRequest request);
    UpdateUserResponse update(int id,UpdateUserRequest request);
    GetUserResponse getById(int id);
    List<GetUserListResponse> getUserList();
    void deleteById(int id);
}
