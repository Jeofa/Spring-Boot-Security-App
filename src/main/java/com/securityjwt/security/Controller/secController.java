package com.securityjwt.security.Controller;

import com.securityjwt.security.Model.AuthenticationRequest;
import com.securityjwt.security.Model.AuthenticationResponse;
import com.securityjwt.security.Model.RegisterRequest;
import com.securityjwt.security.Service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class secController {

    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request){
        return  ResponseEntity.ok(authenticationService.register(request));

    }

    @PostMapping("/authentication")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody AuthenticationRequest request){
        return  ResponseEntity.ok(authenticationService.authenticate(request));

    }
}
