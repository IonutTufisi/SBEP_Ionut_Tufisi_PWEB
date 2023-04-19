package com.sbep.SBEP.config;

import com.sbep.SBEP.Repository.TokenRepository;
import lombok.RequiredArgsConstructor;
//import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
@RequiredArgsConstructor
public class LogoutService implements LogoutHandler {

    private final TokenRepository tokenRepository; //tokenRepository1;

    @Override
    public void logout(
            HttpServletRequest request,
            HttpServletResponse response,
            org.springframework.security.core.Authentication authentication
    ) {
        final String authHeader = request.getHeader("Authorization");
        final String jwt;
        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            return;
        }
        jwt = authHeader.substring(7);
        var storedToken = tokenRepository.findByToken(jwt)
                .orElse(null);
        if (storedToken != null) {
            storedToken.setExpired(true);
            storedToken.setRevoked(true);
            tokenRepository.save(storedToken);
            SecurityContextHolder.clearContext();
        }
        var storedToken1 = tokenRepository.findByToken(jwt)
                .orElse(null);
        if (storedToken1 != null) {
            storedToken1.setExpired(true);
            storedToken1.setRevoked(true);
            tokenRepository.save(storedToken1);
            SecurityContextHolder.clearContext();
        }
    }
}
