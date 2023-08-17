package com.yagiz.userservice.business.dtos.reponses.update;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateUserResponse {
    private int id;
    private String username;
    private String email;
    private String password;
    private String role;
}
