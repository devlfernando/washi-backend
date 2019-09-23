package br.com.washi.washibackend.entity.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Estado {
    SP("São Paulo"),
    RJ("Rio de Janeiro"),
    SC("Santa Catarina");

    @JsonValue
    private final String displayName;

    Estado(String displayName) {
        this.displayName = displayName;
    }
}