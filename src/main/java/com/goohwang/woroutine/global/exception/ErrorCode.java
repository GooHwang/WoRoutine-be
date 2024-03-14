package com.goohwang.woroutine.global.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    /*User 2xxxx*/
    //400
    USER_ALREADY_EXIST(HttpStatus.BAD_REQUEST, 2000, "the user already exists"),
    PASSWORD_NOT_MATCH(HttpStatus.BAD_REQUEST, 2000, "wrong password"),
    // 404
    USER_NOT_EXIST(HttpStatus.NOT_FOUND, 2001,"the user doesn't exist");

    private final HttpStatus status;
    private final int code;
    private final String message;
}
