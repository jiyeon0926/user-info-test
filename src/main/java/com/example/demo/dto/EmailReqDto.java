package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class EmailReqDto {

    private final String email;

    @JsonCreator
    public EmailReqDto(@JsonProperty("email") String email) {
        this.email = email;
    }
}
