package com.yagiz.userservice.business.dtos.reponses.create;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateUserResponse {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String role;
}
