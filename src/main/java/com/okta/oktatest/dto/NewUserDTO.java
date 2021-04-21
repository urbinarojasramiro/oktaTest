package com.okta.oktatest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class NewUserDTO implements Serializable {
    @JsonProperty("profile")
    private ProfileDTO profile;
    @JsonProperty("credentials")
    private CredentialsDTO credentials;

    public NewUserDTO(ProfileDTO profile, CredentialsDTO credentials) {
        this.profile = profile;
        this.credentials = credentials;
    }

    public NewUserDTO() {
    }

    public ProfileDTO getProfile() {
        return profile;
    }

    public void setProfile(ProfileDTO profile) {
        this.profile = profile;
    }

    public CredentialsDTO getCredentials() {
        return credentials;
    }

    public void setCredentials(CredentialsDTO credentials) {
        this.credentials = credentials;
    }

    @Override
    public String toString() {
        return "NewUserDTO{" +
                "profile=" + profile +
                ", credentials=" + credentials +
                '}';
    }
}
