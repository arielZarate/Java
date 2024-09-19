package com.springsecurity.register_login.register_login.entity;

public enum Role {

    ADMIN("ADMIN"),
    USER("USER");

    private final String description;

    private Role(String desc) {
        this.description = desc;
    }

    public String getDescription() {
        return description;
    }

}
