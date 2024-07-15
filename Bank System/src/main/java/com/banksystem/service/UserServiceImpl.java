package com.banksystem.service;

import com.banksystem.dto.UserDTO;
import com.banksystem.entity.Users;
import com.banksystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository usersRepository;

    @Override
    public Users createUsers(UserDTO userDTO) {
        Users users = new Users();
        users.setUsername(userDTO.getUsername());
        users.setPassword(userDTO.getPassword());
        users.setNom(userDTO.getNom());
        users.setRole(userDTO.getRole());
        return usersRepository.save(users);
    }

    @Override
    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public Optional<Users> getUsersById(int userId) {
        return usersRepository.findById(userId);
    }

    @Override
    public void deleteUsers(int userId) {
        usersRepository.deleteById(userId);
    }
}
