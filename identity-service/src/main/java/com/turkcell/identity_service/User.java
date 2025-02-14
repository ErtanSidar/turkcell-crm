package com.turkcell.identity_service;

import java.time.LocalDateTime;

public class User {
    private Long id;
    private String username;
    private String password;
    private String email;
    private Boolean isActive;
    private LocalDateTime lastLoginDate;
    private LocalDateTime createdAt;
}
