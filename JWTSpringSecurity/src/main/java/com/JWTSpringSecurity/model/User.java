package com.JWTSpringSecurity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String email;
    private String password;
    private  String firstName;
    private String lastName;


    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
