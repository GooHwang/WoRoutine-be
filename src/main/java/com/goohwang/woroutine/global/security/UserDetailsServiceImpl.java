package com.goohwang.woroutine.global.security;

import com.goohwang.woroutine.domain.user.entity.User;
import com.goohwang.woroutine.domain.user.repository.UserRepository;
import com.goohwang.woroutine.global.exception.ErrorCode;
import com.goohwang.woroutine.global.exception.GlobalException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserDetailsServiceImpl{

    private final UserRepository userRepository;

    public UserDetailsImpl getUserDetails(String email) {
        User user = userRepository.findByEmail(email)
            .orElseThrow(() -> new GlobalException(ErrorCode.USER_NOT_EXIST));
        return new UserDetailsImpl(user);
    }
}
