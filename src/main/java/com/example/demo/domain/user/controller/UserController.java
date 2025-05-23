package com.example.demo.domain.user.controller;

import com.example.demo.domain.user.dto.EmailReqDto;
import com.example.demo.domain.user.dto.TokenDto;
import com.example.demo.domain.user.dto.UserResDto;
import com.example.demo.domain.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    // 이메일 인증을 통해 토큰 발급
    @PostMapping("/auth/email")
    public ResponseEntity<TokenDto> issueTokenByEmail(@RequestBody EmailReqDto emailReqDto) {
        userService.issueTokenByEmail(emailReqDto.getEmail());

        return new ResponseEntity<>(HttpStatus.OK);
    }

    // 토큰으로 사용자 정보 조회
    @GetMapping("/users/me")
    public ResponseEntity<UserResDto> findUserByToken() {
        userService.findUserByToken();

        return new ResponseEntity<>(HttpStatus.OK);
    }
}