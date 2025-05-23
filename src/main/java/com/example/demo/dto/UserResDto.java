package com.example.demo.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UserResDto {

    private final Long id;
    private final String email;
    private final String name;
    private final String bookTitle;
    private final String author; // 작가
    private final String publisher; // 출판사
}
