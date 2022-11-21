package com.luca.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Encrypted;

@Document
public class UserModel
{
    @Id
    private String id;

    private String username;
    @Encrypted
    private String pwd;

    public UserModel(String username, String pwd){
        super();
        this.username = username;
        this.pwd = pwd;
    }
}
