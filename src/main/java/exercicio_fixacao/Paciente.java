package exercicio_fixacao;

public class Paciente {
    private String nome;
    private int idade;
    private double peso;

    public Paciente(String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;

    }


    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                '}';
    }
}
