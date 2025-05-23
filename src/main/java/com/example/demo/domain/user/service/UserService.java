package com.example.demo.domain.user.service;

import com.example.demo.domain.user.dto.TokenDto;
import com.example.demo.domain.user.repository.UserRepository;
import com.example.demo.global.jwt.JwtProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final JwtProvider jwtProvider;

    public TokenDto issueTokenByEmail(String email) {
        String token = jwtProvider.generateToken(email);

        return new TokenDto("Bearer", token);
    }

    @Transactional(readOnly = true)
    public void findUserByToken() {
    }
}
