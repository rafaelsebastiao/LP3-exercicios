package desafio_rapido;

import java.util.Scanner;




public class Main {
    public static void main(String [] args) {
        Aluno aluno = new Aluno("Joaozinho", "473-182-382-43", "123456789");
        Curso curso = new Curso("Desenvolvimento de sistemas", "Tecnólogo", "Astolfo");


        System.out.println(aluno.toString());

        aluno.realizarAtividade();
        aluno.realizarAtividade();
        aluno.realizarAtividade();

        System.out.println(aluno.toString());

        System.out.println(curso.toString());
        curso.ingressarAluno(aluno);

        System.out.println(curso.toString());


        aluno.trancarMatricula();

        System.out.println(aluno.toString());

        System.out.println(curso.toString());




    }
}
