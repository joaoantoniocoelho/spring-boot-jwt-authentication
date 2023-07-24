package com.example.demo.model.dto.auth;

import com.example.demo.model.UserRole;

public record RegisterDto(String login, String password, UserRole role) {
}
