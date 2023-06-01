package com.securityjwt.security.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/trial")
public class TrialContoller {

    @GetMapping("/hello")
    public ResponseEntity<String> greetings(){
        return ResponseEntity.ok("Hello there");
    }
}
