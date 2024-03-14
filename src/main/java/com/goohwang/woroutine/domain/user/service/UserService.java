package com.goohwang.woroutine.domain.user.service;

import com.goohwang.woroutine.domain.user.dto.request.SignUpRequest;
import com.goohwang.woroutine.domain.user.entity.User;
import com.goohwang.woroutine.domain.user.repository.UserRepository;
import com.goohwang.woroutine.global.exception.ErrorCode;
import com.goohwang.woroutine.global.exception.GlobalException;
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

    public void signup(SignUpRequest request) {
        String email = request.email();
        String password = passwordEncoder.encode(request.password());

        if (userRepository.findByEmail(email).isPresent()) {
            throw new GlobalException(ErrorCode.USER_ALREADY_EXIST);
        }

        User user = new User(email, password, request.nickname());
        userRepository.save(user);
    }
}
