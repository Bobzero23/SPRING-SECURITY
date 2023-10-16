package com.JWTSpringSecurity.serivice;

import org.springframework.security.core.userdetails.UserDetails;

public interface JwtService {
    String extractUserName(String username);
    String generateToken(UserDetails userDetails);
    boolean isTokenValid(String token, UserDetails userDetails);
}
