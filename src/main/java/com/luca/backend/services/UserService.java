package com.luca.backend.services;

import com.luca.backend.DTO.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public ResponseEntity<UserDTO> login (){
        return ResponseEntity.ok();
    }
}
