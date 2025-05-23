package com.example.demo.domain.user.service;

import com.example.demo.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void issueTokenByEmail(String email) {
    }

    @Transactional(readOnly = true)
    public void findUserByToken() {
    }
}
