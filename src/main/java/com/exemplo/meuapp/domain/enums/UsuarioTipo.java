package com.exemplo.meuapp.domain.enums;

public enum UsuarioTipo {
    ALUNO("ALUNO"),
    PROFESSOR("PROFESSOR"),
    VISITANTE("VISITANTE");

    private final String role;


    UsuarioTipo(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
