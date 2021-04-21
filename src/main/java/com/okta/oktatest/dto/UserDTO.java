package com.okta.oktatest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class UserDTO implements Serializable {
    @JsonProperty("id")
    private String id;
    @JsonProperty("status")
    private String status;
    @JsonProperty("created")
    private String created;
    @JsonProperty("activated")
    private String activated;
    @JsonProperty("statusChanged")
    private String statusChanged;
    @JsonProperty("lastLogin")
    private String lastLogin;
    @JsonProperty("lastUpdated")
    private String lastUpdated;
    @JsonProperty("passwordChanged")
    private String passwordChanged;
    @JsonProperty("profile")
    private ProfileDTO profile;

    public UserDTO(String id, String status, String created, String activated, String statusChanged, String lastLogin, String lastUpdated, String passwordChanged, ProfileDTO profile) {
        this.id = id;
        this.status = status;
        this.created = created;
        this.activated = activated;
        this.statusChanged = statusChanged;
        this.lastLogin = lastLogin;
        this.lastUpdated = lastUpdated;
        this.passwordChanged = passwordChanged;
        this.profile = profile;
    }

    public UserDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getActivated() {
        return activated;
    }

    public void setActivated(String activated) {
        this.activated = activated;
    }

    public String getStatusChanged() {
        return statusChanged;
    }

    public void setStatusChanged(String statusChanged) {
        this.statusChanged = statusChanged;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getPasswordChanged() {
        return passwordChanged;
    }

    public void setPasswordChanged(String passwordChanged) {
        this.passwordChanged = passwordChanged;
    }

    public ProfileDTO getProfile() {
        return profile;
    }

    public void setProfile(ProfileDTO profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", status='" + status + '\'' +
                ", created='" + created + '\'' +
                ", activated='" + activated + '\'' +
                ", statusChanged='" + statusChanged + '\'' +
                ", lastLogin='" + lastLogin + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", passwordChanged='" + passwordChanged + '\'' +
                ", profile=" + profile +
                '}';
    }
}

