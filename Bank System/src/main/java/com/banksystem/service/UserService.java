package com.banksystem.service;

import com.banksystem.dto.UserDTO;
import com.banksystem.entity.Users;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public Users createUsers(UserDTO userDTO) ;
    List<Users> getAllUsers();
//    User updateUser(int userId, User user);
    public void deleteUsers(int userId);
    public Optional<Users> getUsersById(int userId);
}
