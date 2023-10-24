package com.springsecurity1.service;

import com.springsecurity1.config.UserInfoDetails;
import com.springsecurity1.model.UserInfo;
import com.springsecurity1.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserInfoDetailsService implements UserDetailsService {

    @Autowired
    private UserInfoRepository userInfoRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserInfo> userInfo = userInfoRepository.findByName(username);

         return userInfo.map(UserInfoDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("can't find a user with name: " + username));

    }
}
