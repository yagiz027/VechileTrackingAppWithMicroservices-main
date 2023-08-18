package com.yagiz.userservice.business.dtos.reponses.update;

import java.util.UUID;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateUserResponse {
    private UUID id;
    private String username;
    private String email;
    private String password;
    private String role;
}
