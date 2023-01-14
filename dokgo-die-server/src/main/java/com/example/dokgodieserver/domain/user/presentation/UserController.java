package com.example.dokgodieserver.domain.user.presentation;

import com.example.dokgodieserver.domain.user.presentation.dto.request.SignInRequest;
import com.example.dokgodieserver.domain.user.presentation.dto.request.SignUpRequest;
import com.example.dokgodieserver.domain.user.presentation.dto.response.TokenResponse;
import com.example.dokgodieserver.domain.user.service.UserSignInService;
import com.example.dokgodieserver.domain.user.service.UserSignUpService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RequestMapping("/users")
@RestController
public class UserController {

    private final UserSignUpService userSignUpService;
    private final UserSignInService userSignInService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void signUp(@RequestBody @Valid SignUpRequest request) {
        userSignUpService.execute(request);
    }

    @PostMapping("/auth")
    public TokenResponse signIn(@RequestBody @Valid SignInRequest request) {
        return userSignInService.execute(request);
    }

}
