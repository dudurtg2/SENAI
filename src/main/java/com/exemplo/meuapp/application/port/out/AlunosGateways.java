package com.exemplo.meuapp.application.port.out;

import java.util.List;
import java.util.UUID;

import com.exemplo.meuapp.domain.enums.UsuariosStatus;

import com.exemplo.meuapp.domain.model.Alunos;

public interface AlunosGateways {
    Alunos save(Alunos alunos);

    void delete(UUID alunosId);

    Alunos update(Alunos alunos);

    Alunos getAlunos(UUID alunosId);

    Alunos getAlunosByMatricula(String matricula);

    List<Alunos> getAlunosByStatus(UsuariosStatus status);

    List<Alunos> getAllAlunos();

}
