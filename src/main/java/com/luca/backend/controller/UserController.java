package com.luca.backend.controller;

import com.luca.backend.DTO.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/login")
    public ResponseEntity<UserDTO> Login(){
        return ResponseEntity.ok();
    }
}
