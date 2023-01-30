package com.salary.management.salarymanagementwebapp.jwt.resource;

import java.io.Serializable;

public class JwtTokenRequest implements Serializable {

    private static final long serialVersionUID = -5616176897013108345L;

    private String login;
    private String password;

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String login, String password) {
        this.setUsername(login);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.login;
    }

    public void setUsername(String login) {
        this.login = login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
