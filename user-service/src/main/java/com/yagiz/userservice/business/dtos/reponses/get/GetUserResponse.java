package com.yagiz.userservice.business.dtos.reponses.get;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetUserResponse {
    private int id;
    private String username;
    private String email;
    private String password;
    private String role;
}
