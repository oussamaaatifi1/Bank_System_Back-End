package com.banksystem.controller;

import com.banksystem.dto.UserDTO;
import com.banksystem.entity.Users;
import com.banksystem.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserServiceImpl usersService;

    @PostMapping("/add")
    public ResponseEntity<Users> createUsers(@RequestBody UserDTO userDTO) {
        Users addedUser = usersService.createUsers(userDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedUser);
    }

    @GetMapping("/all")
    public List<Users> getAllUsers() {
        return usersService.getAllUsers();
    }

    @GetMapping("/{userId}")
    public ResponseEntity<Users> getUsersById(@PathVariable int userId) {
        Optional<Users> user = usersService.getUsersById(userId);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteUsers(@PathVariable int userId) {
        usersService.deleteUsers(userId);
        return ResponseEntity.noContent().build();
    }
}
