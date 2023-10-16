package com.JWTSpringSecurity.serivice;

import com.JWTSpringSecurity.dao.request.SignInRequest;
import com.JWTSpringSecurity.dao.request.SignUpRequest;
import com.JWTSpringSecurity.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);
    JwtAuthenticationResponse signin(SignInRequest request);
}
