package br.com.washi.washibackend.entity.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Cidade {
    SAO_PAULO("São Paulo"),
    ATIBAIA("Atibaia"),
    RIBERAO_PRETO("Ribeirão Preto"),
    SANTOS("Santos"),
    CAMPOS_JORDAO("Campos de Jordão");

    @JsonValue
    private final String displayName;

    Cidade(String displayName) {
        this.displayName = displayName;
    }
}
