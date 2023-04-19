package com.sbep.SBEP.Auth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService service;
    private final AuthenticationService1 service1;


    @PostMapping("/users/register")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(service.register(request));
    }
    @PostMapping("/users/authenticate")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request
    ) {
        return ResponseEntity.ok(service.authenticate(request));
    }

    @PostMapping("/admin/register")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<AuthenticationResponse> register1(
            @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(service1.register1(request));
    }
    @PostMapping("/admin/authenticate")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<AuthenticationResponse> authenticate1(
            @RequestBody AuthenticationRequest request
    ) {
        return ResponseEntity.ok(service1.authenticate1(request));
    }

    @PostMapping("/refresh-token")
    @PreAuthorize("hasRole('ADMIN')")
    public void refreshToken(
            HttpServletRequest request,
            HttpServletResponse response
          //  HttpServletRequest request1,
            //HttpServletResponse response1

    ) throws IOException {
        service.refreshToken(request, response);
        //service1.refreshToken(request1, response1);
    }

}
