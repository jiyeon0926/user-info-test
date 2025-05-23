package com.example.demo.domain.user.service;

import com.example.demo.domain.user.dto.TokenDto;
import com.example.demo.domain.user.dto.UserResDto;
import com.example.demo.domain.user.entity.User;
import com.example.demo.domain.user.repository.UserRepository;
import com.example.demo.global.jwt.JwtProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

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
    public UserResDto findUserByToken(String token) {
        String email = jwtProvider.getEmailFromToken(token);
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "사용자를 찾을 수 없습니다."));

        return new UserResDto(
                user.getId(),
                user.getEmail(),
                user.getName(),
                user.getBookTitle(),
                user.getAuthor(),
                user.getPublisher()
        );
    }
}
