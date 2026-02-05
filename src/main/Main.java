package main;

import model.Aluno;
import service.AlunoService;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        List<Aluno> alunos = Arrays.asList(
                new Aluno("João", "Java", 8),
                new Aluno("Maria", "Java", 6),
                new Aluno("Pedro", "Python", 7),
                new Aluno("Ana", "Python", 9),
                new Aluno("João", "Java", 8) // duplicado
        );

        AlunoService service = new AlunoService();

        System.out.println("✅ Aprovados:");
        service.getAprovados(alunos).forEach(System.out::println);

        System.out.println("\n❌ Reprovados:");
        service.getReprovados(alunos).forEach(System.out::println);

        System.out.println("\n📚 Agrupados por curso:");
        Map<String, List<Aluno>> porCurso = service.agruparPorCurso(alunos);
        porCurso.forEach((curso, lista) -> {
            System.out.println(curso + ": " + lista);
        });

        System.out.println("\n🔢 Contagem por curso:");
        service.contarPorCurso(alunos)
                .forEach((curso, total) ->
                        System.out.println(curso + ": " + total));

        System.out.println("\n🚫 Sem duplicatas:");
        service.removerDuplicatas(alunos).forEach(System.out::println);

        System.out.println("\n📊 Ordenados por nota:");
        service.ordenarPorNota(alunos).forEach(System.out::println);
    }
}
