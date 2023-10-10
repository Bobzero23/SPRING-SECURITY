package com.JWTSpringSecurity.serivice;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {
    UserDetailsService userdetailsService();
}
