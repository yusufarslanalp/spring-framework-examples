package com.example.springsecuritybasic.services;


import java.util.Arrays;
import java.util.List;

import com.example.springsecuritybasic.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.springsecuritybasic.models.MyUser;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<SimpleGrantedAuthority> roles = null;

        MyUser user = userRepository.findByUsername(username);
        if (user != null) {
            roles = Arrays.asList(new SimpleGrantedAuthority(user.getRole()));
            return new User(user.getUsername(), user.getPassword(), roles);
        }
        throw new UsernameNotFoundException("User not found with the name " + username);
    }

    public MyUser save(MyUser user) {
        user.setPassword( bcryptEncoder.encode(user.getPassword()) );
        return userRepository.save( user );
    }

}


