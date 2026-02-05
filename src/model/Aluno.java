package model;
import java.util.Objects;

public class Aluno {

    private String aluno;
    private double nota;
    private String curso;


    public Aluno(String aluno, String curso, double nota) {
        this.aluno = aluno;
        this.nota = nota;
        this.curso = curso;
    }


    public String getAluno() {
        return aluno;
    }

    public double getNota() {
        return nota;
    }

    public String getCurso() {
        return curso;
    }

    public boolean isAprovado (){
        return nota >= 7;
    }


    public String toString(){
        return aluno + " - " + curso + " - Nota: " + nota;
    }

    // Importante para remover duplicatas


    public boolean equals (Object o) {
        if(this == o) return true;
        if(!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(aluno, curso) &&
                        Objects.equals(curso, aluno.curso);

    }


    public int hashCode (){
        return Objects.hash(aluno, curso);
    }



}
