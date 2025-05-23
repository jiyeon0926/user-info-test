package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "info")
@Getter
public class User {

    @Id
    private Long id;

    private String email;
    private String name;
    private String bookTitle;
    private String author;
    private String publisher;
}
