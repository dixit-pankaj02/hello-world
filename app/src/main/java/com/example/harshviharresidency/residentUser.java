package com.example.harshviharresidency;

public class residentUser {
    private String id;
    private String username;
    private String password;
    private String email;

    public residentUser() {

    }

    public residentUser(String id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }
    public residentUser(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
