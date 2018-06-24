package com.howtographql.hackernews.models;

public class AuthData {

    private String email;
    private String password;

    public AuthData(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public AuthData() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
