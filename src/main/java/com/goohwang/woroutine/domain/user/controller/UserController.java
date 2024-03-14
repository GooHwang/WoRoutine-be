package com.goohwang.woroutine.domain.user.controller;

import com.goohwang.woroutine.domain.user.dto.request.LogInRequest;
import com.goohwang.woroutine.domain.user.dto.request.SignUpRequest;
import com.goohwang.woroutine.domain.user.service.UserService;
import com.goohwang.woroutine.global.dto.ApiResponse;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Getter
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public ApiResponse<Void> signup(@Valid @RequestBody SignUpRequest signUpRequest) {
        userService.signup(signUpRequest);
        return new ApiResponse<>(HttpStatus.CREATED, "successfully signed up.");
    }

    @PostMapping("/login")
    public ApiResponse<Void> login(
        @RequestBody LogInRequest logInRequest,
        HttpServletResponse response
    ) {
        userService.login(logInRequest, response);
        return new ApiResponse<>(HttpStatus.CREATED, "successfully logged in.");
    }

}
