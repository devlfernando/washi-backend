package br.com.washi.washibackend.entity.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Bairro {
    PERDIZES("Perdizes"),
    MOEMA("Moema"),
    PINHEIROS("Pinheiros"),
    PARAISO("Paraiso"),
    SAUDE("Saude"),
    CONSOLACAO("Consolação");

    @JsonValue
    private final String displayName;

    Bairro(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
