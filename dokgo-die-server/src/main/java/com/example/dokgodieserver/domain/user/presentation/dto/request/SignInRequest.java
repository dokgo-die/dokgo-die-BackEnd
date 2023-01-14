package com.example.dokgodieserver.domain.user.presentation.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SignInRequest {

    @NotBlank
    private String accountId;

    @NotBlank
    private String name;

    @NotBlank
    private String password;

}
