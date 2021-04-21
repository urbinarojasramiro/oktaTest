package com.okta.oktatest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Password implements Serializable {
    @JsonProperty("value")
    private String value;

    public Password(String value) {
        this.value = value;
    }

    public Password() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
