package com.goohwang.woroutine.domain.user.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record SignUpRequest(
    @Email String email,
    @Pattern(regexp = "^[a-zA-Z0-9!@#$]{8,15}$", message = "password should be 8-15 letters including a-z, A-Z, 0-9, !@#$")
    String password,
    String checkPassword,
    @NotBlank String nickname
) {

}
