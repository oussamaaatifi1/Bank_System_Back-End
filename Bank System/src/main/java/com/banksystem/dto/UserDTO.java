package com.banksystem.dto;

import com.banksystem.entity.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private String username;
    private String password;
    private String nom;
    private Role role;
}
