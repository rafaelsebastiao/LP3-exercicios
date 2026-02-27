package desafio_rapido;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private String grauAcademico;
    private String instrutor;

    private List<Aluno> alunos = new ArrayList<Aluno>();

    public Curso(String nome, String grauAcademico, String instrutor){
        this.nome = nome;
        this.grauAcademico = grauAcademico;
        this.instrutor = instrutor;

    }

    public void ingressarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void imprimirAlunos(){
        for(Aluno aluno : alunos){
            if (aluno.isMatriculaAtiva()){
                System.out.println(aluno.getNome());
            }else {
                alunos.remove(aluno);
            }
        }
    }


    public String getNome() {
        return nome;
    }

    public String getGrauAcademico() {
        return grauAcademico;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor){
        this.instrutor = instrutor;
    }


    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", grauAcademico='" + grauAcademico + '\'' +
                ", instrutor='" + instrutor + '\'' +
                ", alunos=" + alunos +
                '}';
    }
}
