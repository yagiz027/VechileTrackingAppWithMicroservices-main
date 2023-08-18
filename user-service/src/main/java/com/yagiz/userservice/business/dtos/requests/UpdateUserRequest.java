package com.yagiz.userservice.business.dtos.requests;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateUserRequest {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String role;
}
