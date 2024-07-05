package com.banksystem.service;

import com.banksystem.dto.UserDTO;
import com.banksystem.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public User CreateUser(UserDTO userDTO);
    Optional<User> getUserById(int userId);
    List<User> getAllUsers();
//    User updateUser(int userId, User user);
    void deleteUser(int userId);
}
