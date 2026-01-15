package com.gustavo.auth_api.domain.user;

public enum UserRole {
    ADMIN("admin"),
    User("user");

    private final String role;

    UserRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
    
}
