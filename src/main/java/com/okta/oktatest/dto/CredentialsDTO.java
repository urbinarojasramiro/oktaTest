package com.okta.oktatest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class CredentialsDTO implements Serializable {
    @JsonProperty("password")
    private Password password;

    public CredentialsDTO(Password password) {
        this.password = password;
    }

    public CredentialsDTO() {
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }
}
