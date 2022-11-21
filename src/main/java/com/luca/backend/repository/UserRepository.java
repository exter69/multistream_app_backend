package com.luca.backend.repository;

import com.luca.backend.DTO.UserDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserRepository extends MongoRepository<UserDTO, String> {

    @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
    List<UserDTO> findAll(String category);
}
