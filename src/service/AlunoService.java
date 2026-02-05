package service;

import model.Aluno;

import java.util.*;
import java.util.stream.Collectors;


public class AlunoService {

    // Listar aprovados

    public List<Aluno> getAprovados(List<Aluno> alunos) {
        return alunos.stream().filter(Aluno::isAprovado)
                .collect(Collectors.toList());

    }

    // Filtrar Reprovados
    public List<Aluno> getReprovados(List<Aluno> alunos){
        return alunos.stream()
                .filter(a -> !a.isAprovado())
                .collect(Collectors.toList());
    }

    //Agrupar por Curso
    public Map<String, List<Aluno>> agruparPorCurso(List<Aluno> alunos){
        return alunos.stream()
                .collect(Collectors.groupingBy(Aluno::getCurso));
    }

    // Contar ocorrências por curso
    public Map<String, Long> contarPorCurso(List<Aluno> alunos){
        return alunos.stream()
                .collect(Collectors.groupingBy(
                        Aluno::getCurso,
                        Collectors.counting()
                ));
    }

    // Remover Duplicatas

    public List<Aluno> removerDuplicatas(List<Aluno> alunos){
        return alunos.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    // 6️⃣ Ordenar por nota (decrescente)
    public List<Aluno> ordenarPorNota(List<Aluno> alunos) {
        return alunos.stream()
                .sorted(Comparator.comparingDouble(Aluno::getNota).reversed())
                .collect(Collectors.toList());
    }

}
