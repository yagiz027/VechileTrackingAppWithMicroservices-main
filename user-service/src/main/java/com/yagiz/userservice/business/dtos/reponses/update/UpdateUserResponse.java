package com.yagiz.userservice.business.dtos.reponses.update;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateUserResponse {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String role;
}
