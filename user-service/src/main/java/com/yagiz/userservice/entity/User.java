package com.yagiz.userservice.entity;

import java.util.UUID;

import com.yagiz.userservice.entity.Roles.UserRole;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    private int id;
    private String name;
    private String surname;
    private UUID companyId;
    private String companyName;
    @Enumerated(EnumType.STRING)
    private UserRole role;
}
