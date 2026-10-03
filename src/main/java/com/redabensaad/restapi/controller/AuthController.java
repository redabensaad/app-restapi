package com.redabensaad.restapi.controller;

import com.redabensaad.restapi.dto.AuthDTO;
import com.redabensaad.restapi.dto.UserDTO;
import com.redabensaad.restapi.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public AuthDTO.LoginResponse login(@Valid @RequestBody AuthDTO.LoginRequest request) {
        return authService.login(request);
    }

    @PostMapping("/register")
    public ResponseEntity<AuthDTO.RegisterResponse> register(@Valid @RequestBody UserDTO.CreateUserDTO request) {
        return new ResponseEntity<>(authService.register(request), HttpStatus.CREATED);
    }
}