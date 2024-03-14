package com.goohwang.woroutine.domain.user.controller;

import com.goohwang.woroutine.domain.user.repository.UserRepository;
import com.goohwang.woroutine.domain.user.service.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Getter
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;

}
