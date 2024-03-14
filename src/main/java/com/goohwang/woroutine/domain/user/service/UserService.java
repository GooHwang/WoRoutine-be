package com.goohwang.woroutine.domain.user.service;

import com.goohwang.woroutine.domain.user.repository.UserRepository;
import com.goohwang.woroutine.global.jwt.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;
}
